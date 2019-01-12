package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.Storagestock;
import com.bos.domain.StoragestockTemp;

import java.util.List;

/**
 * @author Simon
 */
public interface IStorageStockDao extends IBaseDao<Storagestock> {

    /**
     * 更新仓库-盘存信息
     * @param materialid
     */
    public void updateStorageStock(int materialid);

    /**
     * 查询货物是否存在
     * @param mid
     * @return
     */
    public List<Storagestock> getMaterialId(int mid);

    /**
     * 获取商品是否存在 sysnumber = 0
     * @param mid
     * @return
     */
    public List<StoragestockTemp> sumMaterialNumberIns(int mid);

    /**
     * 检查商品是否存在 sysnumber = 1
     * @param mid
     * @return
     */
    public List<StoragestockTemp> sumMaterialNumberOut(int mid);
}
