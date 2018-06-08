package com.bos.dao.base.impl;

import com.bos.dao.base.IBaseDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 持久层通用实现
 * @author Simon
 */

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {

    /**
     * 实体类型
     */
    private Class<T> entityClass;

    /**
     * 使用注解的方式进行依赖注入
     * @param sessionFactory
     */
    @Resource
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    /**
     * 在构造方法中获得动态操作的实体类型
     */
    public BaseDaoImpl() {
        // 获取父类(BaseDaoImpl<T>)类型
        ParameterizedType genericSuperClass = (ParameterizedType) this.getClass().getGenericSuperclass();
        // 获得父类上的泛型数组
        Type[] actualTypeArguments = genericSuperClass.getActualTypeArguments();
        entityClass = (Class<T>) actualTypeArguments[0];
    }

    /**
     * 添加
     *
     * @param entity
     */
    @Override
    public void save(Object entity) {
        this.getHibernateTemplate().save(entity);
    }

    /**
     * 删除
     *
     * @param entity
     */
    @Override
    public void delete(Object entity) {
        this.getHibernateTemplate().delete(entity);
    }

    /**
     * 修改
     *
     * @param entity
     */
    @Override
    public void update(Object entity) {
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
