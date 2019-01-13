package com.bos.service.impl;

import com.bos.dao.IOutstorageDao;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Outstorage;
import com.bos.domain.Storage;
import com.bos.service.IOutStorageService;
import com.bos.service.IStockService;
import com.bos.service.IStorageService;
import com.bos.service.IStorageStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Simon
 */
@Service
public class OutsotrageServiceImpl implements IOutStorageService {

    @Autowired
    private IOutstorageDao outstorageDao;

    @Resource
    private IStorageService storageService;
    @Resource
    private IStockService stockService;
    @Resource
    private IStorageStockService storageStockService;

    /**
     * 查询全部出货信息
     *
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllOutStorageInfo() {
        List<MaterialAndSupplier> list = outstorageDao.findAllOutStorage();
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 添加进货信息
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
    public void saveOutstorageInfo(String date, int materialid, Long number, int userid, int storageid, String remark) {

        Outstorage outstorage = new Outstorage();
        outstorage.setDate(date);
        outstorage.setMaterialid(materialid);
        outstorage.setNumber(number);
        outstorage.setUserid(userid);
        outstorage.setStorageid(storageid);
        outstorage.setRemark(remark);

        // 根据Id查询仓库信息
        Storage storage = new Storage();
        List<Storage> list = storageService.findBySId(storageid);
        for (Storage storage1 : list) {
            storage.setId(storage1.getId());
            storage.setMaterialnum(storage1.getMaterialnum());
        }
        int numInt = Integer.parseInt(String.valueOf(number));

        int sumIns = storageStockService.sumMaterialNumberIns(materialid);
        int sumOut = storageStockService.sumMaterialNumberOut(materialid);
        int restNum = sumIns - sumOut;

        // 判断调用仓库内是否有足够库存
        if ( restNum > Integer.parseInt(number.toString())) {
            // 开始进行出库操作
            try {
                outstorageDao.save(outstorage);
                storageService.delStorageMaterialNum(storageid, String.valueOf(number));
                int outstorageId = outstorageDao.maxOutstorageId();
                stockService.saveStock(date, outstorageId, remark);
                storageStockService.saveStorageStockOut(storageid, materialid, numInt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("出货失败");
        }

    }
}
