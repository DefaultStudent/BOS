package com.bos.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Instorage {
    private int id;
    private Date date;
    private Long number;
    private String remark;
    private Area areaByAreaid;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "number", nullable = true)
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instorage instorage = (Instorage) o;
        return id == instorage.id &&
                Objects.equals(date, instorage.date) &&
                Objects.equals(number, instorage.number) &&
                Objects.equals(remark, instorage.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, number, remark);
    }

    @ManyToOne
    @JoinColumn(name = "areaid", referencedColumnName = "id")
    public Area getAreaByAreaid() {
        return areaByAreaid;
    }

    public void setAreaByAreaid(Area areaByAreaid) {
        this.areaByAreaid = areaByAreaid;
    }
}
