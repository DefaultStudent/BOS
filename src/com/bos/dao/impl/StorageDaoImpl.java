package com.bos.dao.impl;

import com.bos.dao.IStorageDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.Storage;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Simon
 */
@Repository
public class StorageDaoImpl extends BaseDaoImpl<Storage> implements IStorageDao {

    /**
     * 添加仓库信息
     * @param storage
     */
    @Override
    public void saveStorage(Storage storage) {
        // 获取当前仓库编号最大值
        String hql = " select max(id) FROM Storage";
        List list = this.getHibernateTemplate().find(hql);
        // 将新增仓库的编号加一
        int id = (Integer) list.get(0) + 1;
        storage.setId(id);
        this.getHibernateTemplate().save(storage);
    }

    /**
     * 更新库存
     *
     * @param number
     * @param storageId
     */
    @Override
    public void updateStorageNum(String number, int storageId) {
        String sql = "update Storage set materialnum = " + number + " where id = " + storageId;
        Session session = this.getSessionFactory().getCurrentSession();
        session.createQuery(sql).executeUpdate();
    }
}
