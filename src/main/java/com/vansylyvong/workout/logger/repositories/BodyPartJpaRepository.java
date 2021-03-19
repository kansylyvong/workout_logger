package com.vansylyvong.workout.logger.repositories;

import com.vansylyvong.workout.logger.model.BodyPart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyPartJpaRepository extends JpaRepository<BodyPart, Long> {
}
