package com.bos.service.impl;

import com.bos.dao.IStorageDao;
import com.bos.domain.Storage;
import com.bos.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
