package com.vansylyvong.workout.logger.model;

import javax.persistence.*;

@Entity
@Table(name="exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE_EX")
    @SequenceGenerator(name="SEQUENCE_EX", sequenceName="SEQ_EXERCISES", allocationSize=1)
    @Column(name="exercise_pk")
    private Long exercisePk;
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
    private Muscle muscle;
    @ManyToOne
    @JoinColumn(name="equipment_pk")
    private Equipment equipment;
    @ManyToOne
    @JoinColumn(name="muscle_group_pk")
    private MuscleGroup muscleGroup;
    @ManyToOne
    @JoinColumn(name="body_part_pk")
    private BodyPart bodyPart;


    public BodyPart getBodyPart() {
        return this.bodyPart;
    }
    public MuscleGroup getMuscleGroup() {
        return this.muscleGroup;
    }

    public Equipment getEquipment() {
        return this.equipment;
    }

    public Muscle getMuscle() {
        return this.muscle;
    }
    public Category getCategory() {
        return this.category;
    }

    public void setMuscleGroup(MuscleGroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public void setMuscle(Muscle muscle) {
        this.muscle = muscle;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void setBodyPart(BodyPart bodyPart) {
        this.bodyPart = bodyPart;
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

    public void setExercisePk(Long exercisePk) {
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
