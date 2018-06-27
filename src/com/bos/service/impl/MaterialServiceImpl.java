package com.bos.service.impl;

import com.bos.dao.IMaterialDao;
import com.bos.dao.InstorageDao;
import com.bos.domain.Instorage;
import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.service.IMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Simon
 */
@Service
@Transactional(rollbackFor = SQLException.class)
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    private IMaterialDao materialDao;

    @Autowired
    private InstorageDao instorageDao;

    /**
     * 添加商品
     *
     * @param material
     * @param userid
     * @param storageid
     * @param number
     * @param remark
     */
    @Override
    public void addMaterial(Material material, int userid, int storageid, Long number, String remark) {
        Instorage instorage = new Instorage();
        // 将Long转换为int
        int num = new Long(number).intValue();
        // 增加库存
        materialDao.numAdd(storageid, num);
        // 保存货物信息
        materialDao.saveMaterial(material);

        // 设置进货信息
        instorage.setDate(material.getDate());
        instorage.setMaterialid(material.getId());
        instorage.setNumber(number);
        instorage.setUserid(userid);
        instorage.setStorageid(storageid);
        instorage.setRemark(remark);
        // 保存进货消息
        instorageDao.saveInstorage(instorage);
    }

    /**
     * 删除商品
     *
     * @param material
     * @param instorageid
     * @param storageid
     * @param num
     */
    @Override
    public void deleteMaterial(Material material, int instorageid, int storageid, Long num) {
        int number = new Long(num).intValue();
        instorageDao.deleteInstorageById(instorageid);
        materialDao.numSub(storageid, number);
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
