package com.bos.service;

import com.bos.domain.MaterialAndSupplier;

import java.util.List;

/**
 * @author Simon
 */

public interface IOutStorageService {

    /**
     * 查询全部出货信息
     * @return
     */
    public List<MaterialAndSupplier> findAllOutStorageInfo();

    /**
     * 添加进货信息
     * @param date
     * @param materialid
     * @param number
     * @param userid
     * @param storageid
     * @param remark
     */
    public void saveOutstorageInfo(String date, int materialid, Long number, int userid, int storageid, String remark);
}