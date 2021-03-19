package com.vansylyvong.workout.logger.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="exercise_category")
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE_CAT")
    @SequenceGenerator(name="SEQUENCE_CAT", sequenceName="SEQ_EXERCISE_CATEGORY", allocationSize=1)
    @Column(name="category_pk")
    private Long categoryPk;
    @Column(name="category_name")
    private String categoryName;
    @Column(name="subcategory_name")
    private String subcategoryName;
    @Column(name="microcategory_name")
    private String microcategoryName;

    public Category() {
    }

    public Long getCategoryPk() {
        return categoryPk;
    }

    public void setCategoryPk(Long categoryPk) {
        this.categoryPk = categoryPk;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public String getMicrocategoryName() {
        return microcategoryName;
    }

    public void setMicrocategoryName(String microcategoryName) {
        this.microcategoryName = microcategoryName;
    }
}
