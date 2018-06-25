package com.bos.service.impl;

import com.bos.dao.IMaterialDao;
import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.service.IMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Simon
 */
@Service
@Transactional
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    private IMaterialDao materialDao;

    /**
     * 添加商品
     *
     * @param material
     * @param id
     */
    @Override
    public void addMaterial(Material material, int id) {
        materialDao.numAdd(id);
        materialDao.save(material);
    }

    /**
     * 删除商品
     *
     * @param material
     * @param id
     */
    @Override
    public void deleteMaterial(Material material, int id) {
        materialDao.numSub(id);
        materialDao.delete(material);
    }

    /**
     * 查询全部商品信息
     *
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllMaterial() {
        List<MaterialAndSupplier> list = materialDao.findAllMaterial();
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
    public List<MaterialAndSupplier> findMaterialById(int id) {
        List<MaterialAndSupplier> list = materialDao.findMaterialById(id);
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }

    /**
     * 更新商品
     *
     * @param material
     */
    @Override
    public void updateMaterial(Material material) {

    }
}
