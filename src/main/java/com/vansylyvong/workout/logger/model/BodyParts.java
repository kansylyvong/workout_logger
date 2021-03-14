package com.vansylyvong.workout.logger.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="body_parts")
public class BodyParts {
    @Id
    @Column(name="body_part_pk")
    private long bodyPartPk;

    @Column(name="body_part_name")
    private String bodyPartName;

    public BodyParts(){}

    public long getBodyPartPk() {
        return bodyPartPk;
    }

    public void setBodyPartPk(long bodyPartPk) {
        this.bodyPartPk = bodyPartPk;
    }

    public String getBodyPartName() {
        return bodyPartName;
    }

    public void setBodyPartName(String bodyPartName) {
        this.bodyPartName = bodyPartName;
    }
}
