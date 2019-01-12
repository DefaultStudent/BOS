package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Outstorage;

import java.util.List;

/**
 * @author Simon
 */

public interface IOutstorageDao extends IBaseDao<Outstorage> {

    /**
     * 查询全部出库信息
     * @return
     */
    public List<MaterialAndSupplier> findAllOutStorage();

    public int maxOutstorageId();
}
