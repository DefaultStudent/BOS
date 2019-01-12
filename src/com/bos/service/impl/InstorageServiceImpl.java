package com.bos.service.impl;

import com.bos.dao.IMaterialDao;
import com.bos.dao.InstorageDao;
import com.bos.domain.Instorage;
import com.bos.domain.MaterialAndSupplier;
import com.bos.service.IStockService;
import com.bos.service.IStorageService;
import com.bos.service.IStorageStockService;
import com.bos.service.InStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Simon
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class InstorageServiceImpl implements InStorageService {

    @Autowired
    private InstorageDao instorageDao;
    @Autowired
    private IMaterialDao materialDao;

    @Resource
    private IStorageService storageService;
    @Resource
    private IStockService stockService;
    @Resource
    private IStorageStockService storageStockService;

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
    @Transactional(rollbackFor = Exception.class)
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
        storageService.addStorageMaterialNum(storageid, number.toString());
        stockService.saveStock(date, 0, remark);
        int id = materialDao.maxId();
        storageStockService.saveStorageStock(storageid, id + 1, Integer.parseInt(number.toString()));
    }

    /**
     * 查询全部进货表信息
     *
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAll() {
        List<MaterialAndSupplier> list = instorageDao.findAllInstorage();
        if (list.size() > 0) {
            return list;
        }
        return null;
    }
}
