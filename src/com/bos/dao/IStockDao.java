package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.Stock;

/**
 * @author Simon
 */
public interface IStockDao extends IBaseDao<Stock> {

    /**
     * 查询盘存信息表id
     * @return
     */
    public int findStockId();
}
