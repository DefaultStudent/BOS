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
     * 查询全部商品信息
     * @return
     */
    public List<MaterialAndSupplier> findAllMaterial();

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    public List<MaterialAndSupplier> findMaterialById(int id);

    /**
     * 库存加一
     * @param id
     */
    public void numAdd(int id, int num);

    /**
     * 库存减一
     * @param id
     */
    public void numSub(int id);
}
