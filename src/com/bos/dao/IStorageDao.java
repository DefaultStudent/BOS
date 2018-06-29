package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.Storage;

public interface IStorageDao extends IBaseDao<Storage> {

    /**
     * 添加仓库信息
     * @param model
     */
    public void saveStorage(Storage model);

    /**
     * 更新库存
     * @param number
     * @param storageId
     */
    public void updateStorageNum(String number, int storageId);
}
