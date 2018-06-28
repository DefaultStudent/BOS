package com.bos.service;

/**
 * @author Simon
 */
public interface IStorageStockService {

    /**
     * 添加仓库-盘存信息
     * @param storageid
     * @param materialName
     * @param number
     */
    public void saveStorageStock(int storageid, String materialName, int number);
}
