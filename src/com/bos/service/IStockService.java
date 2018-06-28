package com.bos.service;

/**
 * @author Simon
 */
public interface IStockService {

    /**
     * 添加盘存信息
     * @param date
     * @param outstorageid
     * @param remark
     */
    public void saveStock(String date, int outstorageid, String remark);
}
