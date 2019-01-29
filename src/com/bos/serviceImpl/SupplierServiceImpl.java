package com.bos.serviceImpl;

import com.bos.dao.ISupplierDao;
import com.bos.domain.Supplier;
import com.bos.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Simon
 */
@Service
@Transactional
public class SupplierServiceImpl implements ISupplierService {

    @Autowired
    private ISupplierDao supplierDao;

    /**
     * 查询全部供应商信息
     *
     * @return
     */
    @Override
    public List<Supplier> findAllSupplier() {
        List list = supplierDao.findAll();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }

    /**
     * 保存供应商信息
     *
     * @param supplier
     */
    @Override
    public void saveSupplier(Supplier supplier) {
        supplierDao.saveSupplier(supplier);
    }

    /**
     * 删除供应商信息
     *
     * @param supplier
     */
    @Override
    public void deleteSupplier(Supplier supplier) {
        supplierDao.delete(supplier);
    }

    /**
     * 根据id查询供应商信息
     *
     * @param id
     * @return
     */
    @Override
    public Supplier findSupplierById(int id) {
        return supplierDao.findById(id);
    }

    /**
     * 更新供应商信息
     *
     * @param supplier
     */
    @Override
    public void updateSupplier(Supplier supplier) {
        supplierDao.update(supplier);
    }
}
