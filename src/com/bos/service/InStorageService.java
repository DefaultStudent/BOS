package com.bos.service;

import com.bos.domain.Instorage;

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
}
