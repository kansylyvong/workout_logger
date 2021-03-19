package com.vansylyvong.workout.logger.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Equipment implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE_EQ")
    @SequenceGenerator(name="SEQUENCE_EQ", sequenceName="SEQ_EQUIPMENT", allocationSize=1)
    @Column(name="equipment_pk")
    private long equipmentPk;

    @Column(name="equipment_name")
    private String equipmentName;

    @Column(name="equipment_desc")
    private String equipmentDesc;

    @ManyToOne
    @JoinColumn(name="equipment_category_pk")
    private EquipmentCategory equipmentCategory;

    public EquipmentCategory getEquipmentCategory() {
        return this.equipmentCategory;
    }

    public Equipment() {}

    public void setEquipmentCategory(EquipmentCategory eqCat) {
        this.equipmentCategory = eqCat;
    }
    public long getEquipmentPk() {
        return equipmentPk;
    }

    public void setEquipmentPk(long equipmentPk) {
        this.equipmentPk = equipmentPk;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipment_name) {
        this.equipmentName = equipment_name;
    }

    public String getEquipmentDesc() {
        return equipmentDesc;
    }

    public void setEquipmentDesc(String equipmentDesc) {
        this.equipmentDesc = equipmentDesc;
    }
}
