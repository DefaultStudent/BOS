package com.bos.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Storage {
    private int id;
    private String name;
    private String address;
    private String materialnum;
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
    @Column(name = "address", nullable = true, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "materialnum", nullable = true, length = 50)
    public String getMaterialnum() {
        return materialnum;
    }

    public void setMaterialnum(String materialnum) {
        this.materialnum = materialnum;
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
        Storage storage = (Storage) o;
        return id == storage.id &&
                Objects.equals(name, storage.name) &&
                Objects.equals(address, storage.address) &&
                Objects.equals(materialnum, storage.materialnum) &&
                Objects.equals(remark, storage.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, address, materialnum, remark);
    }

    @OneToMany(mappedBy = "storageByStorageid")
    public Collection<Instorage> getInstoragesById() {
        return instoragesById;
    }

    public void setInstoragesById(Collection<Instorage> instoragesById) {
        this.instoragesById = instoragesById;
    }

    @OneToMany(mappedBy = "storageByStorageid")
    public Collection<Outstorage> getOutstoragesById() {
        return outstoragesById;
    }

    public void setOutstoragesById(Collection<Outstorage> outstoragesById) {
        this.outstoragesById = outstoragesById;
    }
}
