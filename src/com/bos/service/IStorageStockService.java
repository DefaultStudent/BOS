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
    public void saveStorageStock(int storageid, int materialId, int number);

    /**
     * 更新仓库-盘存信息
     * @param materialid
     */
    public void updateStorageStock(int materialid);
}
