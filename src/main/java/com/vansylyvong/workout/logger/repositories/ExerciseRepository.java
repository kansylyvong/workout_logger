package com.vansylyvong.workout.logger.repositories;

import com.vansylyvong.workout.logger.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class ExerciseRepository {
    @PersistenceContext
    private EntityManager em;

    @Autowired
    ExerciseJpaRepository jpaRepository;

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
        return jpaRepository.findByExerciseName(exerciseName);
    }

}
