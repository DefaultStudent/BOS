package com.bos.service.impl;

import com.bos.dao.IMaterialDao;
import com.bos.domain.Material;
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
     */
    @Override
    public void addMaterial(Material material) {
        materialDao.save(material);
    }

    /**
     * 删除商品
     *
     * @param material
     */
    @Override
    public void deleteMaterial(Material material) {
        materialDao.delete(material);
    }

    /**
     * 查询全部商品信息
     *
     * @return
     */
    @Override
    public List<Material> findAllMaterial() {
        List list = materialDao.findAll();
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
    public Material findMaterialById(int id) {
        return materialDao.findById(id);
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
