package com.vansylyvong.workout.logger.repositories;

import com.vansylyvong.workout.logger.model.Muscle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuscleJpaRepository extends JpaRepository<Muscle, Long> {
    Muscle findByMuscleName(String muscleName);
}
