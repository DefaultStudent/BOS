package com.bos.serviceImpl;

import com.bos.dao.IMaterialDao;
import com.bos.dao.IStockDao;
import com.bos.dao.IStorageStockDao;
import com.bos.dao.InstorageDao;
import com.bos.domain.*;
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
    @Autowired
    private IStockDao stockDao;
    @Autowired
    private InstorageDao instorageDao;
    @Autowired
    private IStorageStockDao storageStockDao;

    @Resource
    private InStorageService inStorageService;
    @Resource
    private IStorageService storageService;

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
        String remark = material.getRemark();

        // 获取已经存在的商品名称
        List<Material> list = materialDao.findMaterialByName(name);

        // 判断当前商品名称是否存在
        if (list.size() == 0) {
            // 如果不存在
            // 获取当前商品编号的最大值
            int id = materialDao.maxId();

            // 开始入库操作
            inStorageService.saveFirstInstorage(date, id + 1, num, userId, storageId, remark);
            storageService.addStorageMaterialNum(storageId, numString);
            Stock stock = new Stock();
            stock.setDate(date);
            int instorageId = instorageDao.findInstorageId();
            stock.setInstorageid(instorageId);
            stock.setOutstorageid(instorageId);
            stock.setRemark("无");
            stockDao.save(stock);
            // 仓库-盘存的sysnum默认为0，即「进货」状态
            Storagestock storagestock = new Storagestock();
            int stockId = stockDao.findStockId();
            storagestock.setStockid(stockId);
            storagestock.setStorageid(storageId);
            storagestock.setMaterialid(id + 1);
            storagestock.setNumber(number);
            storagestock.setSystemnumber(0);
            storageStockDao.save(storagestock);
            materialDao.save(material);
        } else {
            // 如果存在，则输出：添加失败
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
