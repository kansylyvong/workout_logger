package com.vansylyvong.workout.logger.repositories;

import com.vansylyvong.workout.logger.model.MuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuscleGroupJpaRepository extends JpaRepository<MuscleGroup, Long> {
    MuscleGroup findByMuscleGroupName(String mgName);
}
