package com.bos.dao.impl;

import com.bos.dao.InstorageDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.Instorage;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Simon
 */
@Repository
public class InstorageDaoImpl extends BaseDaoImpl<Instorage> implements InstorageDao {
    /**
     * 查询进货单编号
     * @return
     */
    @Override
    public int findInstorageId() {
        // 获取当前仓库编号最大值
        String hql = " select max(id) FROM Instorage ";
        String hql1 = "SELECT id FROM Instorage";
        List list = this.getHibernateTemplate().find(hql);
        List list1 = this.getHibernateTemplate().find(hql1);
        if (list.isEmpty()) {
            return 0;
        } else {
            int id = (Integer) list.get(0);
            return id;
        }
    }
}
