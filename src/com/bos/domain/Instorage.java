package com.bos.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Instorage {
    private int id;
    private String date;
    private int materialid;
    private Long number;
    private int userid;
    private int storageid;
    private String remark;

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
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "materialid", nullable = true)
    public int getMaterialid() {
        return materialid;
    }

    public void setMaterialid(int materialid) {
        this.materialid = materialid;
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
    @Column(name = "userid", nullable = true)
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "storageid", nullable = true)
    public int getStorageid() {
        return storageid;
    }

    public void setStorageid(int storageid) {
        this.storageid = storageid;
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
                Objects.equals(materialid, instorage.materialid) &&
                Objects.equals(number, instorage.number) &&
                Objects.equals(userid, instorage.userid) &&
                Objects.equals(storageid, instorage.storageid) &&
                Objects.equals(remark, instorage.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, materialid, number, userid, storageid, remark);
    }
}
