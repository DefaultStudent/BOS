package com.bos.dao;

import com.bos.domain.Supplier;

/**
 * @author Simon
 */
public interface ISupplierDao extends IBaseDao<Supplier> {

    /**
     * 添加供应商
     *
     * @param supplier
     */
    public void saveSupplier(Supplier supplier);
}
