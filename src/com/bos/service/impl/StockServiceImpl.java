package com.bos.service.impl;

import com.bos.dao.IStockDao;
import com.bos.dao.InstorageDao;
import com.bos.domain.Instorage;
import com.bos.domain.Stock;
import com.bos.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * @author Simon
 */
@Service
@Transactional(rollbackFor = SQLException.class)
public class StockServiceImpl implements IStockService {

    @Autowired
    private IStockDao stockDao;

    @Autowired
    private InstorageDao instorageDao;

    /**
     * 添加盘存信息
     *
     * @param date\
     * @param outstorageid
     * @param remark
     */
    @Override
    public void saveStock(String date, int outstorageid, String remark) {

        Stock stock = new Stock();
        // 设置盘存信息
        stock.setDate(date);
        int instorageid = instorageDao.findInstorageId();
        stock.setInstorageid(instorageid);
        // 判断商品是否为首次入库
        if (outstorageid == 0) {
            // 商品为首次入库
            stock.setOutstorageid(instorageid);
            stock.setRemark("首次入库");
        } else if (instorageid == outstorageid) {
            // 商品进行移库操作
            stock.setOutstorageid(outstorageid);
            stock.setRemark("商品已删除");
        } else {
            // 商品进行移库操作
            stock.setOutstorageid(outstorageid);
            stock.setRemark(remark);
        }
        stockDao.save(stock);
    }
}
