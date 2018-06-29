package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.Storagestock;

/**
 * @author Simon
 */
public interface IStorageStockDao extends IBaseDao<Storagestock> {

    /**
     * 更新仓库-盘存信息
     * @param materialid
     */
    public void updateStorageStock(int materialid);
}
