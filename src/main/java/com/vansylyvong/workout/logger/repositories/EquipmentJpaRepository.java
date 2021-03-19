package com.vansylyvong.workout.logger.repositories;

import com.vansylyvong.workout.logger.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EquipmentJpaRepository extends JpaRepository<Equipment, Long> {
    Equipment findByEquipmentName(String eqName);
}
