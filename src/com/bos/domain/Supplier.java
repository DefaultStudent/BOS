package com.bos.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Supplier {
    private int supplyid;
    private String sname;
    private String phone;
    private String email;
    private String address;
    private Integer code;

    @Id
    @Column(name = "supplyid", nullable = false)
    public int getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(int supplyid) {
        this.supplyid = supplyid;
    }

    @Basic
    @Column(name = "sname", nullable = false, length = 50)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
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
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                Objects.equals(sname, supplier.sname) &&
                Objects.equals(phone, supplier.phone) &&
                Objects.equals(email, supplier.email) &&
                Objects.equals(address, supplier.address) &&
                Objects.equals(code, supplier.code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplyid, sname, phone, email, address, code);
    }
}
