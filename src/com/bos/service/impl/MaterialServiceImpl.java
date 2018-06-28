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
@Transactional(rollbackFor = SQLException.class)
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
     * @param materialName
     * @return
     */
    @Override
    public List findMaterialByName(String materialName) {
        return materialDao.findMaterialByName(materialName);
    }
}
