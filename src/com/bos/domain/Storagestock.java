package com.bos.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Storagestock {
    private int stid;
    private int stockid;
    private int storageid;
    private int materialid;
    private int number;
    private int systemnumber;

    @Id
    @Column(name = "stid", nullable = false)
    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    @Basic
    @Column(name = "stockid", nullable = false)
    public int getStockid() {
        return stockid;
    }

    public void setStockid(int stockid) {
        this.stockid = stockid;
    }

    @Basic
    @Column(name = "storageid", nullable = false)
    public int getStorageid() {
        return storageid;
    }

    public void setStorageid(int storageid) {
        this.storageid = storageid;
    }

    @Basic
    @Column(name = "materialid", nullable = false)
    public int getMaterialid() {
        return materialid;
    }

    public void setMaterialid(int materialid) {
        this.materialid = materialid;
    }

    @Basic
    @Column(name = "number", nullable = false)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "systemnumber", nullable = false)
    public int getSystemnumber() {
        return systemnumber;
    }

    public void setSystemnumber(int systemnumber) {
        this.systemnumber = systemnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storagestock that = (Storagestock) o;
        return stid == that.stid &&
                stockid == that.stockid &&
                storageid == that.storageid &&
                materialid == that.materialid &&
                number == that.number &&
                systemnumber == that.systemnumber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(stid, stockid, storageid, materialid, number, systemnumber);
    }
}
