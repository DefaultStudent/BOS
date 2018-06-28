package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.Instorage;

/**
 * @author Simon
 */
public interface InstorageDao extends IBaseDao<Instorage> {

    /**
     * 查询进货单编号
     * @return
     */
    public int findInstorageId();
}
