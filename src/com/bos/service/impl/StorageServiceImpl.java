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
@Transactional
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
}
