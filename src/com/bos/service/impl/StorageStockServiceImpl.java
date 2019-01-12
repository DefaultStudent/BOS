package com.bos.service.impl;

import com.bos.dao.IStockDao;
import com.bos.dao.IStorageStockDao;
import com.bos.domain.Storagestock;
import com.bos.domain.StoragestockTemp;
import com.bos.service.IStorageStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Simon
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StorageStockServiceImpl implements IStorageStockService {

    @Autowired
    private IStorageStockDao storageStockDao;

    @Autowired
    private IStockDao stockDao;

    /**
     * 添加仓库-盘存信息
     *
     * @param storageid
     * @param materialId
     * @param number
     */
    @Override
    public void saveStorageStock(int storageid, int materialId, int number) {

        Storagestock storagestock = new Storagestock();

        // 获取盘存信息表id
        int stockid = stockDao.findStockId();
        storagestock.setStockid(stockid);

        storagestock.setStorageid(storageid);
        storagestock.setMaterialid(materialId);
        storagestock.setNumber(number);
        storagestock.setSystemnumber(1);

        // 添加仓库-盘存信息
        storageStockDao.save(storagestock);
    }

    /**
     * 更新仓库-盘存信息
     *
     * @param materialid
     */
    @Override
    public void updateStorageStock(int materialid) {
        storageStockDao.updateStorageStock(materialid);
    }

    /**
     * 获取商品是否存在 sysnumber = 0
     *
     * @param mid
     * @return
     */
    @Override
    public int sumMaterialNumberIns(int mid) {
        List<StoragestockTemp> list = storageStockDao.sumMaterialNumberIns(mid);
        StoragestockTemp storagestockTemp = new StoragestockTemp();
        for (StoragestockTemp storagestockTemp1 : list) {
            storagestockTemp.setSumIns(storagestockTemp1.getSumIns());
            storagestockTemp.setMname(storagestockTemp1.getMname());
        }
        int sumIns = storagestockTemp.getSumIns();
        return sumIns;
    }

    /**
     * 获取商品是否存在 sysnumber = 1
     *
     * @param mid
     * @return
     */
    @Override
    public int sumMaterialNumberOut(int mid) {
        List<StoragestockTemp> list = storageStockDao.sumMaterialNumberOut(mid);
        StoragestockTemp storagestockTemp = new StoragestockTemp();
        for (StoragestockTemp storagestockTemp1 : list) {
            storagestockTemp.setSumOut(storagestockTemp1.getSumOut());
            storagestockTemp.setMname(storagestockTemp1.getMname());
        }
        int sumOut = storagestockTemp.getSumOut();
        return sumOut;
    }
}
