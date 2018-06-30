package com.bos.service;

import com.bos.domain.Instorage;
import com.bos.domain.MaterialAndSupplier;

import java.util.List;

/**
 * @author Simon
 */
public interface InStorageService {

    /**
     * 添加入库明细
     * @param date
     * @param materialid
     * @param number
     * @param userid
     * @param storageid
     * @param remark
     */
    public void saveInstorage(String date, int materialid, Long number, int userid, int storageid, String remark);

    /**
     * 查询全部进货表信息
     * @return
     */
    public List<MaterialAndSupplier> findAll();
}
