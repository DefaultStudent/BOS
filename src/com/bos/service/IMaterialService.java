package com.bos.service;

import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;

import java.util.List;

/**
 * @author Simon
 */
public interface IMaterialService {

    /**
     * 添加商品信息
     * @param material
     */
    public void save(Material material);

    /**
     * 根据name查询id
     * @param materialName
     * @return
     */
    public List findMaterialByName(String materialName);

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    public List<MaterialAndSupplier> findMaterialInformById(int id);

    /**
     * 查询商品信息
     * @return
     */
    public List<MaterialAndSupplier> findAllMaterialInform();

    /**
     * 更新商品信息
     * @param model
     */
    public void updateMaterial(Material model);
}
