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
     * 库存增加
     * @param id
     * @param num
     */
    public void numAdd(int id, int num);

    /**
     * 库存减少
     * @param id
     * @param num
     */
    public void numSub(int id, int num);

    /**
     * 添加商品
     * @param model
     */
    public void saveMaterial(Material model);

    /**
     * 更新商品库存信息
     * @param num
     * @param reid
     * @param adid
     * @return
     */
    public int updateMaterialNum(Long num, int reid, int adid);
}
