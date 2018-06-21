package com.bos.service;

import com.bos.domain.Material;

import java.util.List;

/**
 * @author Simon
 */
public interface IMaterialService {

    /**
     * 添加商品
     * @param model
     */
    public void addMaterial(Material model);

    /**
     * 删除商品
     * @param model
     */
    public void deleteMaterial(Material model);

    /**
     * 查询全部商品信息
     * @return
     */
    public List<Material> findAllMaterial();

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    public Material findMaterialById(int id);

    /**
     * 更新商品
     * @param model
     */
    public void updateMaterial(Material model);
}
