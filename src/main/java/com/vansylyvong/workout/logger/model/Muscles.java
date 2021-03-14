package com.vansylyvong.workout.logger.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="muscles")
public class Muscles {
    @Id
    @Column(name="muscle_pk")
    private long musclePk;
    @Column(name="muscle_name")
    private String muscleName;
    @Transient
    private String muscleGroupName;
    @Transient
    private String bodyPartName;

    public Muscles() {}

    public long getMusclePk() {
        return musclePk;
    }

    public void setMusclePk(long musclePk) {
        this.musclePk = musclePk;
    }

    public String getMuscleName() {
        return muscleName;
    }

    public void setMuscleName(String muscleName) {
        this.muscleName = muscleName;
    }
}
