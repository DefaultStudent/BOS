package com.bos.service;

/**
 * @author Simon
 */
public interface IStorageStockService {

    /**
     * 添加仓库-盘存信息
     * @param storageid
     * @param materialId
     * @param number
     */
    public void saveStorageStockIns(int storageid, int materialId, int number);

    /**
     * 添加仓库-盘存信息
     * @param storageid
     * @param materialId
     * @param number
     */
    public void saveStorageStockOut(int storageid, int materialId, int number);


    /**
     * 更新仓库-盘存信息
     * @param materialid
     */
    public void updateStorageStock(int materialid);

    /**
     * 获取商品是否存在 sysnumber = 0
     * @param mid
     * @return
     */
    public int sumMaterialNumberIns(int mid);

    /**
     * 获取商品是否存在 sysnumber = 1
     * @param mid
     * @return
     */
    public int sumMaterialNumberOut(int mid);
}
