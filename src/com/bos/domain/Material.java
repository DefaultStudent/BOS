package com.bos.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Material {
    private int id;
    private String name;
    private String type;
    private String date;
    private int supplyid;
    private String remark;
    private Collection<Instorage> instoragesById;
    private Collection<Outstorage> outstoragesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 50)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "supplyid", nullable = true)
    public int getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(int supplyid) {
        this.supplyid = supplyid;
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
        Material material = (Material) o;
        return id == material.id &&
                Objects.equals(name, material.name) &&
                Objects.equals(type, material.type) &&
                Objects.equals(date, material.date) &&
                Objects.equals(supplyid, material.supplyid) &&
                Objects.equals(remark, material.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, type, date, supplyid, remark);
    }

    @OneToMany(mappedBy = "materialByMaterialid")
    public Collection<Instorage> getInstoragesById() {
        return instoragesById;
    }

    public void setInstoragesById(Collection<Instorage> instoragesById) {
        this.instoragesById = instoragesById;
    }

    @OneToMany(mappedBy = "materialByMaterialid")
    public Collection<Outstorage> getOutstoragesById() {
        return outstoragesById;
    }

    public void setOutstoragesById(Collection<Outstorage> outstoragesById) {
        this.outstoragesById = outstoragesById;
    }
}
