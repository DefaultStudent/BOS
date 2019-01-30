package com.bos.service.impl;

import com.bos.dao.IStorageDao;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Storage;
import com.bos.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StorageServiceImpl implements IStorageService{

    @Autowired
    private IStorageDao storageDao;

    /**
     * 查询全部仓库信息
     *
     * @return
     */
    @Override
    public List<Storage> findAllStorage() {
        List list = storageDao.findAll();
        return list;
    }

    /**
     * 添加仓库
     *
     * @param storage
     */
    @Override
    public void addStorage(Storage storage) {
        storageDao.saveStorage(storage);
    }

    /**
     * 根据Id查询仓库
     *
     * @param id
     * @return
     */
    @Override
    public Storage findStorageById(int id) {
        return storageDao.findById(id);
    }

    /**
     * 删除仓库
     *
     * @param storage
     */
    @Override
    public void deleteStorage(Storage storage) {
        storageDao.delete(storage);
    }

    /**
     * 更新仓库信息
     *
     * @param storage
     * @return
     */
    @Override
    public void updateStorage(Storage storage) {
        storageDao.update(storage);
    }

    /**
     * 增加库存
     *
     * @param storageId
     * @param number
     */
    @Override
    public void addStorageMaterialNum(int storageId, String number) {
        int max = 100;
        String nowNumber = storageDao.findById(storageId).getMaterialnum();
        int newNumber = Integer.parseInt(nowNumber) + Integer.parseInt(number);
        if (newNumber < max ) {
            storageDao.updateStorageNum(Integer.toString(newNumber), storageId);
        } else {
            String message = "更新失败";
            System.out.println(message);
        }
    }

    /**
     * 减少库存
     *
     * @param storageId
     * @param number
     */
    @Override
    public void delStorageMaterialNum(int storageId, String number) {
        int min = 0;
        String nowNumber = storageDao.findById(storageId).getMaterialnum();
        int newNumber = Integer.parseInt(nowNumber) - Integer.parseInt(number);
        if (newNumber > min ) {
            storageDao.updateStorageNum(Integer.toString(newNumber), storageId);
        } else {
            String message = "更新失败";
            System.out.println(message);
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<Storage> findBySId(int id) {
        List list = storageDao.findBySId(id);
        return list;
    }

    /**
     * 根据Id查询仓库详细存储信息
     *
     * @param id
     * @return
     */
    @Override
    public List<MaterialAndSupplier> storageDetail(int id) {

        List<MaterialAndSupplier> list = (List<MaterialAndSupplier>) storageDao.storageDetails(id);
        List<MaterialAndSupplier> list2 = new ArrayList<>();

        for (MaterialAndSupplier materialAndSupplier : list) {

            MaterialAndSupplier materialAndSupplier1 = new MaterialAndSupplier();

            materialAndSupplier1.setMaterialId(materialAndSupplier.getMaterialId());
            materialAndSupplier1.setMaterialName(materialAndSupplier.getMaterialName());

            List<MaterialAndSupplier> list1 = (List<MaterialAndSupplier>) storageDao.storageOutDetail(id);
            MaterialAndSupplier materialAndSupplier2 = new MaterialAndSupplier();

            for (MaterialAndSupplier materialAndSupplier3 : list1) {
                materialAndSupplier2.setMaterialId(materialAndSupplier3.getMaterialId());
                materialAndSupplier2.setNumber(materialAndSupplier3.getNumber());
            }

            if (materialAndSupplier.getMaterialId() == materialAndSupplier2.getMaterialId()) {
                materialAndSupplier1.setNumber(materialAndSupplier.getNumber() - materialAndSupplier2.getNumber());
            } else {
                materialAndSupplier1.setNumber(materialAndSupplier.getNumber());
            }

            list2.add(materialAndSupplier1);
        }



        /**
         * 循环取出List里面的num再减去同样sql语出查询出来的但是systemnumber = 1的num
         * 将两个num相减在放入这个list里面
         */
        if (list2.size() > 0) {
            return list2;
        }
        return null;
    }
}
