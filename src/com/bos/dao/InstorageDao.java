package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.Instorage;

/**
 * @author Simon
 */
public interface InstorageDao extends IBaseDao<Instorage> {

    /**
     * 添加
     * @param model
     */
    public void saveInstorage(Instorage model);

    /**
     * 根据id删除进货信息
     * @param id
     */
    public void deleteInstorageById(int id);
}
