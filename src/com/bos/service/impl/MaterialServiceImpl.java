package com.bos.service.impl;

import com.bos.dao.IMaterialDao;
import com.bos.dao.IStockDao;
import com.bos.dao.InstorageDao;
import com.bos.domain.Instorage;
import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.service.IMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * @author Simon
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    private IMaterialDao materialDao;

    /**
     * 添加商品信息
     *
     * @param material
     */
    @Override
    public void save(Material material) {
        // 将商品信息添加至商品表
        materialDao.save(material);
    }

    /**
     * 根据name查询id
     *
     * @return
     */
    @Override
    public List findMaterialByName() {
        return materialDao.findMaterialByName();
    }

    /**
     * 查询商品信息
     *
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllMaterialInform() {
        List<MaterialAndSupplier> list = materialDao.findAllMaterialInform();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }

    /**
     * 根据id查询商品信息
     *
     * @param id
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findMaterialInformById(int id) {
        List<MaterialAndSupplier> materialAndSupplierList = materialDao.findMaterialById(id);
        if (materialAndSupplierList.size() > 0) {
            return materialAndSupplierList;
        } else {
            return null;
        }
    }

    /**
     * 更新商品信息
     *
     * @param material
     */
    @Override
    public void updateMaterial(Material material) {
        this.materialDao.update(material);
    }

    /**
     * 删除商品信息
     *
     * @param material
     */
    @Override
    public void deleteMaterial(Material material) {
        this.materialDao.delete(material);
    }
}
