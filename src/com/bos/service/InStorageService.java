package com.bos.service;

import com.bos.domain.Instorage;
import com.bos.domain.MaterialAndSupplier;

import java.util.List;

/**
 * @author Simon
 */
public interface InStorageService {

    /**
     * 添加初次入库明细
     * @param date
     * @param materialid
     * @param number
     * @param userid
     * @param storageid
     * @param remark
     */
    public void saveFirstInstorage(String date, int materialid, Long number, int userid, int storageid, String remark);

    /**
     * 添加入库明细
     * @param date
     * @param materialId
     * @param number
     * @param userId
     * @param storageId
     * @param remark
     */
    public void saveInstorage(String date, int materialId, Long number, int userId, int storageId, String remark);

    /**
     * 查询全部进货表信息
     * @return
     */
    public List<MaterialAndSupplier> findAll();
}
