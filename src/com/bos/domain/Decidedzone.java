package com.bos.domain;

/**
 * 订区实体类
 * @author Simon
 */
public class Decidedzone {
    private String id;
    private String name;
    private Staff bcStaffByStaffId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Staff getBcStaffByStaffId() {
        return bcStaffByStaffId;
    }

    public void setBcStaffByStaffId(Staff bcStaffByStaffId) {
        this.bcStaffByStaffId = bcStaffByStaffId;
    }
}
