package com.vansylyvong.workout.logger.repositories;

import com.vansylyvong.workout.logger.model.Exercise;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class ExerciseRepository {
    @PersistenceContext
    private EntityManager em;

    public Exercise create(Exercise exercise) {
        em.persist(em);
        em.flush();
        return exercise;
    }
    public Exercise update(Exercise exercise) {
        exercise = em.merge(exercise);
        em.flush();
        return exercise;
    }
    public Exercise findByName(String exerciseName) {
        Query query = em.createQuery("select ex from Exercise ex where ex.exerciseName = ?1");
        query.setParameter(1,exerciseName);
        System.out.print(query);
        Exercise exercise = (Exercise) query.getSingleResult();
        return exercise;
    }

}
