package com.vansylyvong.workout.logger.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="muscles")
public class Muscle implements Serializable {
    @Id
    @Column(name="muscle_pk")
    private Long musclePk;
    @Column(name="muscle_name")
    private String muscleName;
    @Transient
    private String muscleGroupName;
    @Transient
    private String bodyPartName;

    public Muscle() {}

    public Long getMusclePk() {
        return musclePk;
    }

    public void setMusclePk(Long musclePk) {
        this.musclePk = musclePk;
    }

    public String getMuscleName() {
        return muscleName;
    }

    public void setMuscleName(String muscleName) {
        this.muscleName = muscleName;
    }
}
