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
}
