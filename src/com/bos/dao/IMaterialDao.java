package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Storage;

import java.util.List;

/**
 * @author Simon
 */
public interface IMaterialDao extends IBaseDao<Material>{

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    public List<MaterialAndSupplier> findMaterialById(int id);

    /**
     * 根据Name查询
     * @param name
     * @return
     */
    public List<Material> findMaterialByName(String name);
}
