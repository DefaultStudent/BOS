package com.bos.dao.impl;

import com.bos.dao.IStorageStockDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.Storagestock;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Simon
 */
@Repository
public class StorageStockDaoImpl extends BaseDaoImpl<Storagestock> implements IStorageStockDao {
    /**
     * 更新仓库-盘存信息
     *
     * @param materialid
     */
    @Override
    public void updateStorageStock(int materialid) {
        String hql = "update Storagestock set number = 0 where materialid = " + materialid;
        Session session = this.getSessionFactory().getCurrentSession();
        session.createQuery(hql).executeUpdate();
    }
}
