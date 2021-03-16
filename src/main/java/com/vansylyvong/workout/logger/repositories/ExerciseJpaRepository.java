package com.vansylyvong.workout.logger.repositories;

import com.vansylyvong.workout.logger.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseJpaRepository extends JpaRepository<Exercise, Long> {
    Exercise findByExerciseName(String exerciseName);
}
