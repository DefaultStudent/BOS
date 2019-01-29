package com.bos.daoImpl;

import com.bos.dao.IStockDao;
import com.bos.domain.Stock;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Simon
 */
@Repository
public class StockDaoImpl extends BaseDaoImpl<Stock> implements IStockDao {

    /**
     * 查询盘存信息表id
     *
     * @return
     */
    @Override
    public int findStockId() {
        String hql = "SELECT max(id) FROM Stock";
        List list = this.getHibernateTemplate().find(hql);
        if (list.isEmpty()) {
            return 0;
        } else {
            int id = (Integer) list.get(0);
            return id;
        }
    }
}
