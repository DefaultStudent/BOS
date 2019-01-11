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
    public void save(Material material, int userId, int number, int storageId, int materialId);

    /**
     * 根据name查询id
     * @return
     */
    public List findMaterialByName();

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

    /**
     * 删除商品信息
     * @param model
     */
    public void deleteMaterial(Material model);

    /**
     * 只查询商品表中的全部信息
     * @return
     */
    public List<Material> findAll();
}
