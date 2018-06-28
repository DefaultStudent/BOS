package com.bos.service.impl;

import com.bos.dao.InstorageDao;
import com.bos.domain.Instorage;
import com.bos.service.InStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * @author Simon
 */
@Service
@Transactional(rollbackFor = SQLException.class)
public class InstorageServiceImpl implements InStorageService {

    @Autowired
    private InstorageDao instorageDao;

    /**
     * 添加入库明细
     *
     * @param date
     * @param materialid
     * @param number
     * @param userid
     * @param storageid
     * @param remark
     */
    @Override
    public void saveInstorage(String date, int materialid, Long number, int userid, int storageid, String remark) {

        Instorage instorage = new Instorage();


        // 设置添加值
        instorage.setDate(date);
        instorage.setMaterialid(materialid);
        instorage.setNumber(number);
        instorage.setUserid(userid);
        instorage.setStorageid(storageid);
        instorage.setRemark(remark);

        // 添加入库明细信息
        instorageDao.save(instorage);
    }
}
