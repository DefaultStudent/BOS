package com.bos.service;

import com.bos.domain.Storage;

import java.util.List;

/**
 * @author Simon
 */
public interface IStorageService {

    /**
     * 查询全部仓库信息
     * @return
     */
    public List<Storage> findAllStorage();

    /**
     * 添加仓库
     * @param model
     */
    public void addStorage(Storage model);

    /**
     * 根据Id查询仓库
     * @param id
     * @return
     */
    public Storage findStorageById(int id);

    /**
     * 删除仓库
     * @param model
     */
    public void deleteStorage(Storage model);

    /**
     * 更新仓库信息
     * @param model
     * @return
     */
    public void updateStorage(Storage model);

    /**
     * 添加库存
     * @param storageId
     * @param number
     */
    public void addStorageMaterialNum(int storageId, String number);

    /**
     * 减少库存
     * @param storageId
     * @param number
     */
    public void delStorageMaterialNum(int storageId, String number);
}
