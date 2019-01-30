package com.bos.dao.base;

import java.io.Serializable;
import java.util.List;

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
