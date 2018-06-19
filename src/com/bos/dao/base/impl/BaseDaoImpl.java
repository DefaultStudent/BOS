package com.bos.dao.base.impl;

import com.bos.dao.base.IBaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {

    private Class<T> entityClass;

    @Resource
    private SessionFactory mySessionFactory;

    @Resource
    public void setMySessionFactory(SessionFactory mySessionFactory) {
        super.setSessionFactory(mySessionFactory);
    }

    public BaseDaoImpl() {
        // 获取父类(BaseDaoImpl)类型
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        // 获得父类上的泛型数组
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        entityClass = (Class<T>) actualTypeArguments[0];
    }

    /**
     * 添加
     *
     * @param entity
     */
    @Override
    public void save(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    /**
     * 删除
     *
     * @param entity
     */
    @Override
    public void delete(T entity) {
        this.getHibernateTemplate().delete(entity);
    }

    /**
     * 修改
     *
     * @param entity
     */
    @Override
    public void update(T entity) {
        this.getHibernateTemplate().update(entity);
    }

    /**
     * 根据Id进行查询
     *
     * @param id
     * @return
     */
    @Override
    public T findById(Serializable id) {
        return this.getHibernateTemplate().get(entityClass, id);
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<T> findAll() {
        String hql = "FROM " + entityClass.getSimpleName();
        return (List<T>) this.getHibernateTemplate().find(hql);
    }
}
