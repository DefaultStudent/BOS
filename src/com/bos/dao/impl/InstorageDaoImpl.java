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
     * 添加
     *
     * @param instorage
     */
    @Override
    public void saveInstorage(Instorage instorage) {
        // 获取当前仓库编号最大值
        String hql = " select max(id) FROM Instorage ";
        List list = this.getHibernateTemplate().find(hql);
        // 将新增仓库的编号加一
        int id = (Integer) list.get(0) + 1;
        instorage.setId(id);
        this.getHibernateTemplate().save(instorage);
    }

    /**
     * 根据id删除进货信息
     *
     * @param id
     */
    @Override
    public void deleteInstorageById(int id) {
        String hql = "delete from Instorage where id = " + id;
        Session session = this.getSessionFactory().getCurrentSession();
        session.createQuery(hql).executeUpdate();
    }
}
