package com.vansylyvong.workout.logger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="exercise_category")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category implements Serializable {
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
        return this.categoryPk;
    }

    public void setCategoryPk(Long categoryPk) {
        this.categoryPk = categoryPk;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubcategoryName() {
        return this.subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public String getMicrocategoryName() {
        return this.microcategoryName;
    }

    public void setMicrocategoryName(String microcategoryName) {
        this.microcategoryName = microcategoryName;
    }
}
