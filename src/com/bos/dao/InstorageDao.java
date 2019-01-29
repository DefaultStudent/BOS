package com.bos.dao;

import com.bos.domain.Instorage;
import com.bos.domain.MaterialAndSupplier;

import java.util.List;

/**
 * @author Simon
 */
public interface InstorageDao extends IBaseDao<Instorage> {

    /**
     * 查询进货单编号
     * @return
     */
    public int findInstorageId();

    /**
     * 查询全部进货信息
     * @return
     */
    public List<MaterialAndSupplier> findAllInstorage();
}
