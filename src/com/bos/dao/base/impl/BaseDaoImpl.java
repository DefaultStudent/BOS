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

/**
 * 持久层通用实现
 * @author Simon
 */

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {

    /**
     * 实体类型
     */
    private Class<T> entityClass;

    @Resource
    private SessionFactory mySessionFactory;

    /**
     * 使用注解的方式进行依赖注入
     * @param mySessionFactory
     */
    @Resource
    public void setMySessionFactory(SessionFactory mySessionFactory) {
        super.setSessionFactory(mySessionFactory);
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

    /**
     * 通用修改方法
     *
     * @param queryName
     * @param objects
     */
    @Override
    public void executeUpdate(String queryName, Object... objects) {
        // 从本地线程中获取一个session对象
        Session session = mySessionFactory.openSession();
        // 使用命名查询语句获得一个查询对象
        Query query = session.getNamedQuery(queryName);
        // 为HQL语句的"?"赋值
        int i = 0;
        for (Object arg : objects) {
            query.setParameter(i++, arg);
        }
        query.executeUpdate();

    }
}
