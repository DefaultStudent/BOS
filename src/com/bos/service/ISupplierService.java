package com.bos.service;

import com.bos.domain.Supplier;

import java.util.List;

/**
 * @author Simon
 */
public interface ISupplierService {

    /**
     * 查询全部供应商信息
     * @return
     */
    public List<Supplier> findAllSupplier();

    /**
     * 保存供应商信息
     * @param model
     */
    public void saveSupplier(Supplier model);

    /**
     * 删除供应商信息
     * @param model
     */
    public void deleteSupplier(Supplier model);

    /**
     * 根据id查询供应商信息
     * @param id
     * @return
     */
    public Supplier findSupplierById(int id);

    /**
     * 更新供应商信息
     * @param model
     */
    public void updateSupplier(Supplier model);
}
