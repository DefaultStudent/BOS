package com.bos.service;

import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;

import java.util.List;

/**
 * @author Simon
 */
public interface IMaterialService {

    /**
     * 添加商品
     * @param model
     * @param userid
     * @param storageid
     * @param number
     * @param remark
     */
    public void addMaterial(Material model, int userid, int storageid, Long number, String remark);

    /**
     * 删除商品
     * @param model
     * @param id
     */
    public void deleteMaterial(Material model, int id);

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
     * 更新商品
     * @param model
     */
    public void updateMaterial(Material model);
}
