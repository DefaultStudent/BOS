package com.bos.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * 抽取持久层通用方法
 * @author Simon
 *
 * @param <T>
 */

public interface IBaseDao<T> {
    /**
     * 添加
     * @param entity
     */
    public void save(T entity);

    /**
     * 删除
     * @param entity
     */
    public void delete(T entity);

    /**
     * 修改
     * @param entity
     */
    public void update(T entity);

    /**
     * 根据Id进行查询
     * @param id
     * @return
     */
    public T findById(Serializable id);

    /**
     * 查询全部
     * @return
     */
    public List<T> findAll();
}
