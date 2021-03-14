package com.vansylyvong.workout.logger.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="muscle_groups")
public class MuscleGroups {
    @Id
    @Column(name="muscle_group_pk")
    private long muscleGroupPk;
    @Column(name="muscle_group_name")
    private String muscleGroupName;

    @Transient
    private String bodyPartName;

    public MuscleGroups() {

    }
   // public String getBodyPartName() {
   //     return 'BodyPartName';
   // }
    public long getMuscleGroupPk() {
        return muscleGroupPk;
    }

    public void setMuscleGroupPk(long muscleGroupPk) {
        this.muscleGroupPk = muscleGroupPk;
    }

    public String getMuscleGroupName() {
        return muscleGroupName;
    }

    public void setMuscleGroupName(String muscleGroupName) {
        this.muscleGroupName = muscleGroupName;
    }

}
