package com.vansylyvong.workout.logger.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.net.http.HttpResponse;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE_EX")
    @SequenceGenerator(name="SEQUENCE_EX", sequenceName="SEQ_EXERCISES", allocationSize=1)
    @Column(name="exercise_pk")
    private long exercisePk;
    @Column(name="exercise_name", nullable = false, unique = true)
    private String exerciseName;
    @Column(name="exercise_desc")
    private String exerciseDesc;
    @Column(name = "exercise_duration")
    private int exerciseDuration;
    //joins
    @ManyToOne
    @JoinColumn(name="category_pk")
    private Category category;
    @ManyToOne
    @JoinColumn(name="muscle_pk")
    private Muscles muscle;
    @ManyToOne
    @JoinColumn(name="equipment_pk")
    private Equipment equipment;
    @ManyToOne
    @JoinColumn(name="muscle_group_pk")
    private MuscleGroups muscleGroups;
    @ManyToOne
    @JoinColumn(name="body_part_pk")
    private BodyParts bodyParts;


    public BodyParts getBodyPart() {
        return this.bodyParts;
    }
    public MuscleGroups getMuscleGroup() {
        return this.muscleGroups;
    }

    public Equipment getEquipment() {
        return this.equipment;
    }

    public Muscles getMuscle() {
        return this.muscle;
    }
    public Category getCategory() {
        return this.category;
    }

    public void setMuscleGroup(MuscleGroups muscleGroups) {
        this.muscleGroups = muscleGroups;
    }

    public void setMuscle(Muscles muscle) {
        this.muscle = muscle;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void setBodyPart(BodyParts bodyParts) {
        this.bodyParts = bodyParts;
    }

    public Exercise() {

    }

    public int getExerciseDuration() {
        return exerciseDuration;
    }

    public void setExerciseDuration(int exerciseDuration) {
        this.exerciseDuration = exerciseDuration;
    }

    public long getExercisePk() {
        return exercisePk;
    }

    public void setExercisePk(long exercisePk) {
        this.exercisePk = exercisePk;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseDesc() {
        return exerciseDesc;
    }

    public void setExerciseDesc(String exerciseDesc) {
        this.exerciseDesc = exerciseDesc;
    }
}
