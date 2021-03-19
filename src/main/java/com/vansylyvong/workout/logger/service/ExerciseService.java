package com.vansylyvong.workout.logger.service;

import com.vansylyvong.workout.logger.model.*;
import com.vansylyvong.workout.logger.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    @Autowired
    ExerciseJpaRepository exRepo;
    @Autowired
    CategoryJpaRepository catRepo;
    @Autowired
    MuscleJpaRepository muscRepo;
    @Autowired
    EquipmentJpaRepository eqRepo;
    @Autowired
    MuscleGroupJpaRepository muscGpRepo;
    @Autowired
    BodyPartJpaRepository bpRepo;

     public Exercise getExerciseByName(String exerciseName) {
         Exercise exercise = exRepo.findByExerciseName(exerciseName);
         return exercise;
     }
    public Exercise addExercise(String exerciseName,
                                Long categoryPk,
                                String exerciseDesc,
                                Long equipmentPk,
                                Long musclePk,
                                Long muscleGroupPk,
                                Long bodyPartPk,
                                int exerciseDuration) {
        Exercise exercise = new Exercise();
        exercise.setExerciseName(exerciseName);
        exercise.setExerciseDesc(exerciseDesc);
        exercise.setExerciseDuration(exerciseDuration);

        Equipment equipment = eqRepo.getOne(equipmentPk);
        exercise.setEquipment(equipment);

        Muscle muscle = muscRepo.getOne(musclePk);
        exercise.setMuscle(muscle);

        MuscleGroup muscleGroup = muscGpRepo.getOne(muscleGroupPk);
        exercise.setMuscleGroup(muscleGroup);

        BodyPart bodyPart = bpRepo.getOne(bodyPartPk);
        exercise.setBodyPart(bodyPart);

        Category category = catRepo.getOne(categoryPk);
        exercise.setCategory(category);
        System.out.println(exercise.getExerciseName() + ' ' + exercise.getExerciseDesc());
        exRepo.save(exercise);
        return exercise;

    }
    /* public Category getCategoryByName(String categoryName) {
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
    public Muscle getMuscleByName(String muscleName) {
        Query query = em.createQuery("select mus from Muscle mus where mus.muscleName = ?1");
        query.setParameter(1,muscleName);
        Muscle muscle = (Muscle) query.getSingleResult();
        return muscle;
    }
    public MuscleGroup getMuscleGroupByName(String muscleGroupName) {
        Query query = em.createQuery("select musg from MuscleGroup musg where musg.muscleGroupName = ?1");
        query.setParameter(1,muscleGroupName);
        MuscleGroup muscleGroups = (MuscleGroup) query.getSingleResult();
        return muscleGroups;
    }
    public BodyPart getBodyPartByName(String bodyPartName) {
        Query query = em.createQuery("select bp from BodyPart bp where bp.bodyPartName = ?1");
        query.setParameter(1,bodyPartName);
        BodyPart bodyPart = (BodyPart) query.getSingleResult();
        return bodyPart;
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
    } */
}
