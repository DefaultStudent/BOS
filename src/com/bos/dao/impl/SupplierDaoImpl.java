package com.bos.dao.impl;

import com.bos.dao.ISupplierDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.Supplier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Simon
 */
@Repository
public class SupplierDaoImpl extends BaseDaoImpl<Supplier> implements ISupplierDao {
    /**
     * 添加供应商
     *
     * @param supplier
     */
    @Override
    public void saveSupplier(Supplier supplier) {
        // 获取当前仓库编号最大值
        String hql = " select max(supplyid) FROM Supplier ";
        List list = this.getHibernateTemplate().find(hql);
        // 将新增仓库的编号加一
        int id = (Integer) list.get(0) + 1;
        supplier.setSupplyid(id);
        this.getHibernateTemplate().save(supplier);
    }
}
