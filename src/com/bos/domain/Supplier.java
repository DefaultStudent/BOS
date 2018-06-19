package com.bos.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Supplier {
    private int supplyid;
    private String name;
    private String phone;
    private String eMail;
    private String address;
    private Integer code;
    private Collection<Material> materialsBySupplyid;

    @Id
    @Column(name = "supplyid", nullable = false)
    public int getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(int supplyid) {
        this.supplyid = supplyid;
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
    @Column(name = "phone", nullable = true, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "E-mail", nullable = true, length = 50)
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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
    @Column(name = "code", nullable = true)
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return supplyid == supplier.supplyid &&
                Objects.equals(name, supplier.name) &&
                Objects.equals(phone, supplier.phone) &&
                Objects.equals(eMail, supplier.eMail) &&
                Objects.equals(address, supplier.address) &&
                Objects.equals(code, supplier.code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplyid, name, phone, eMail, address, code);
    }

    @OneToMany(mappedBy = "supplierBySupplyid")
    public Collection<Material> getMaterialsBySupplyid() {
        return materialsBySupplyid;
    }

    public void setMaterialsBySupplyid(Collection<Material> materialsBySupplyid) {
        this.materialsBySupplyid = materialsBySupplyid;
    }
}
