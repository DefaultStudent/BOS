package com.bos.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

public class Instorage {
    private int id;
    private Date date;
    private Long number;
    private String remark;
    private Area areaByAreaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Area getAreaByAreaid() {
        return areaByAreaid;
    }

    public void setAreaByAreaid(Area areaByAreaid) {
        this.areaByAreaid = areaByAreaid;
    }
}
