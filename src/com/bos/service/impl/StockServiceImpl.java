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
     * @param date
     * @param remark
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveStock(String date, String remark) {

        Stock stock = new Stock();
        int outstorageid = 0;
        // 设置盘存信息
        stock.setDate(date);
        int instorageid = instorageDao.findInstorageId();
        stock.setInstorageid(instorageid);
        // 判断商品是否为首次入库
        if (outstorageid == 0) {
            // 商品为首次入库
            stock.setOutstorageid(instorageid);
            stock.setRemark("无");
        } else {
            // 商品进行移库操作
            stock.setOutstorageid(outstorageid);
            stock.setRemark(remark);
        }
        stockDao.save(stock);
    }
}
