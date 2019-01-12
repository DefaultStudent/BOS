package com.bos.service.impl;

import com.bos.dao.IMaterialDao;
import com.bos.dao.IStockDao;
import com.bos.dao.InstorageDao;
import com.bos.domain.Instorage;
import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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

    @Resource
    private InStorageService inStorageService;
    @Resource
    private IStorageService storageService;
    @Resource
    private IStockService stockService;
    @Resource
    private IStorageStockService storageStockService;

    /**
     * 添加商品信息
     *
     * @param material
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Material material, int userId, int number, int storageId, int materialId) {

        // 获取前台添加的商品信息
        String date = material.getDate();
        Long num = new Long(number);
        String numString = String.valueOf(number);
        String name = material.getName();
        int supplyId = material.getSupplyid();
        String remark = material.getRemark();

        // 获取已经存在的商品名称
        Material material1 = new Material();
        List<Material> list = materialDao.findMaterialByName(name);
        for (Material material2 : list) {
            material1.setId(material2.getId());
            material1.setName(material2.getName());
            material1.setSupplyid(material2.getSupplyid());
        }
        String existMaterialName = material1.getName();
        int existSupplyId = material1.getSupplyid();

        if (name != existMaterialName && supplyId != existSupplyId) {
            try{
                materialDao.save(material);
                inStorageService.saveInstorage(date, materialId, num, userId, storageId, remark);
                storageService.addStorageMaterialNum(storageId, numString);
                stockService.saveStock(date,0, remark);
                storageStockService.saveStorageStock(storageId, materialId, number);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("添加失败");
        }

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

    /**
     * 只查询商品表中的全部信息
     *
     * @return
     */
    @Override
    public List<Material> findAll() {
        return materialDao.findAll();
    }
}
