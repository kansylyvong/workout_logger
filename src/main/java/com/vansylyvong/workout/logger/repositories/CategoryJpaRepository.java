package com.vansylyvong.workout.logger.repositories;

import com.vansylyvong.workout.logger.model.Category;
import com.vansylyvong.workout.logger.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String catName);
}
