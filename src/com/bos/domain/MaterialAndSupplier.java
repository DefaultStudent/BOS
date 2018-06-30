package com.bos.domain;

/**
 * @author Simon
 *
 * 中间类
 */
public class MaterialAndSupplier {

    private int materialId;
    private int supplyid;
    private String materialName;
    private String materialType;
    private String supplierName;
    private int number;
    private int storageid;
    private String storageName;
    private String date;
    private String remark;
    private int instorageId;
    private int outstorageId;
    private String username;

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(int supplyid) {
        this.supplyid = supplyid;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getOutstorageId() {
        return outstorageId;
    }

    public void setOutstorageId(int outstorageId) {
        this.outstorageId = outstorageId;
    }

    public int getStorageid() {
        return storageid;
    }

    public void setStorageid(int storageid) {
        this.storageid = storageid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getInstorageId() {
        return instorageId;
    }

    public void setInstorageId(int instorageId) {
        this.instorageId = instorageId;
    }
}
