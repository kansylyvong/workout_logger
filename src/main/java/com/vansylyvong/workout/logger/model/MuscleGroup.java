package com.vansylyvong.workout.logger.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="muscle_groups")
public class MuscleGroup implements Serializable {
    @Id
    @Column(name="muscle_group_pk")
    private Long muscleGroupPk;
    @Column(name="muscle_group_name")
    private String muscleGroupName;

    @Transient
    private String bodyPartName;

    public MuscleGroup() {

    }
   // public String getBodyPartName() {
   //     return 'BodyPartName';
   // }
    public Long getMuscleGroupPk() {
        return muscleGroupPk;
    }

    public void setMuscleGroupPk(Long muscleGroupPk) {
        this.muscleGroupPk = muscleGroupPk;
    }

    public String getMuscleGroupName() {
        return muscleGroupName;
    }

    public void setMuscleGroupName(String muscleGroupName) {
        this.muscleGroupName = muscleGroupName;
    }

}
