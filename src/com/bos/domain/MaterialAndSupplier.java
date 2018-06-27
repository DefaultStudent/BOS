package com.bos.domain;

import java.sql.Date;

/**
 * @author Simon
 */
public class MaterialAndSupplier {
    private int id;
    private String name;
    private String type;
    private String date;
    private Integer supplyid;
    private String remark;
    private String sname;
    private int storageid;
    private String storagename;
    private Long materialnum;
    private int instorage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(Integer supplyid) {
        this.supplyid = supplyid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getStorageid() {
        return storageid;
    }

    public void setStorageid(int storageid) {
        this.storageid = storageid;
    }

    public String getStoragename() {
        return storagename;
    }

    public void setStoragename(String storagename) {
        this.storagename = storagename;
    }

    public Long getMaterialnum() {
        return materialnum;
    }

    public void setMaterialnum(Long materialnum) {
        this.materialnum = materialnum;
    }

    public int getInstorage() {
        return instorage;
    }

    public void setInstorage(int instorage) {
        this.instorage = instorage;
    }
}
