package com.bos.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Instorage {
    private int id;
    private String date;
    private Integer materialid;
    private Long number;
    private Integer userid;
    private Integer storageid;
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
    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
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
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "storageid", nullable = true)
    public Integer getStorageid() {
        return storageid;
    }

    public void setStorageid(Integer storageid) {
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
