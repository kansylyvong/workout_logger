package com.vansylyvong.workout.logger.service;

import com.vansylyvong.workout.logger.model.*;
import com.vansylyvong.workout.logger.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.*;
import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    ExerciseRepository exRepo;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();

     public Exercise getExerciseByName(String exerciseName) {
         Exercise exercise = exRepo.findByName(exerciseName);
         return exercise;
     }
     public Category getCategoryByName(String categoryName) {
         Query query = em.createQuery("select cat from Category cat where cat.categoryName = ?1");
         query.setParameter(1,categoryName);
         System.out.print(query);
         Category category = (Category) query.getSingleResult();
         return category;
     }

     public List<Category> getAllCategories() {
         Query query = em.createQuery("select cat from Category cat");
         List<Category> cagetgories = query.getResultList();
         return cagetgories;
     }
     public Equipment getEquipmentByName(String equipmentName) {
        Query query = em.createQuery("select eq from Equipment eq where eq.equipmentName = ?1");
        query.setParameter(1,equipmentName);
        Equipment equipment = (Equipment) query.getSingleResult();
        return equipment;
    }
    public Muscles getMuscleByName(String muscleName) {
        Query query = em.createQuery("select mus from Muscles mus where mus.muscleName = ?1");
        query.setParameter(1,muscleName);
        Muscles muscle = (Muscles) query.getSingleResult();
        return muscle;
    }
    public MuscleGroups getMuscleGroupByName(String muscleGroupName) {
        Query query = em.createQuery("select musg from MuscleGroups musg where musg.muscleGroupName = ?1");
        query.setParameter(1,muscleGroupName);
        MuscleGroups muscleGroups = (MuscleGroups) query.getSingleResult();
        return muscleGroups;
    }
    public BodyParts getBodyPartByName(String bodyPartName) {
        Query query = em.createQuery("select bp from BodyParts bp where bp.bodyPartName = ?1");
        query.setParameter(1,bodyPartName);
        BodyParts bodyPart = (BodyParts) query.getSingleResult();
        return bodyPart;
    }
     public Exercise addExercise(String exerciseName,
                                 String categoryName,
                                 String exerciseDesc,
                                 String equipmentName,
                                 String muscleName,
                                 String muscleGroupName,
                                 String bodyPartName,
                                 int exerciseDuration) {
         tx.begin();
         Exercise exercise = new Exercise();
         exercise.setExerciseName(exerciseName);
         exercise.setExerciseDesc(exerciseDesc);
         exercise.setExerciseDuration(exerciseDuration);

         Equipment equipment = getEquipmentByName(equipmentName);
         exercise.setEquipment(equipment);

         Muscles muscle = getMuscleByName(muscleName);
         exercise.setMuscle(muscle);

         MuscleGroups muscleGroups = getMuscleGroupByName(muscleGroupName);
         exercise.setMuscleGroup(muscleGroups);

         BodyParts bodyPart = getBodyPartByName(bodyPartName);
         exercise.setBodyPart(bodyPart);

         Category category = getCategoryByName(categoryName);
         exercise.setCategory(category);
         System.out.println(exercise.getExerciseName() + ' ' + exercise.getExerciseDesc());
         em.persist(exercise);
         tx.commit();
         return exercise;

     }
    public Category addCategory(String categoryName, String subCatName, String micCatName) {
         Category category = new Category();
         tx.begin();
         category.setCategoryName(categoryName);
         category.setSubcategoryName(subCatName);
         category.setMicrocategoryName(micCatName);
         em.persist(category);
         tx.commit();
         return category;
    }

    public Equipment addEquipment(String eqName, String eqDesc, long eqCatPk) {
         Equipment equipment = new Equipment();
         tx.begin();
         EquipmentCategory equipmentCategory = em.find(EquipmentCategory.class,eqCatPk);
         equipment.setEquipmentName(eqName);
         equipment.setEquipmentDesc(eqDesc);
         equipment.setEquipmentCategory(equipmentCategory);
         em.persist(equipment);
         tx.commit();
         return equipment;
    }
}
