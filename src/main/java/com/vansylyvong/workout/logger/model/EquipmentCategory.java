package com.vansylyvong.workout.logger.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="equipment_category")
public class EquipmentCategory implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SEQUENCE_EQ_CAT")
    @SequenceGenerator(name="SEQUENCE_EQ_CAT", sequenceName="SEQ_EQUIPMENT_CATEGORY", allocationSize=1)
    @Column(name="equipment_category_pk")
    private long equipmentCategoryPk;

    @Column(name="equipment_category_name")
    private String equipmentCategoryName;

    @Column(name="equipment_category_desc")
    private String equipmentDesc;

    public EquipmentCategory() {}

    public long getEquipmentCategoryPk() {
        return equipmentCategoryPk;
    }

    public void setEquipmentCategoryPk(long equipmentCategoryPk) {
        this.equipmentCategoryPk = equipmentCategoryPk;
    }

    public String getEquipmentCategoryName() {
        return equipmentCategoryName;
    }

    public void setEquipmentCategoryName(String equipmentCategoryName) {
        this.equipmentCategoryName = equipmentCategoryName;
    }

    public String getEquipmentDesc() {
        return equipmentDesc;
    }

    public void setEquipmentDesc(String equipmentDesc) {
        this.equipmentDesc = equipmentDesc;
    }
}
