package com.bos.dao.impl;

import com.bos.dao.IMaterialDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Storage;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 */
@Repository
public class MaterialDaoImpl extends BaseDaoImpl<Material> implements IMaterialDao{

    /**
     * 根据编号查询商品信息
     *
     * @param id
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findMaterialById(int id) {
        String hql = "select m.id, su.supplyid,  m.name, m.type, su.sname, ss.number, st.name, m.remark, m.date " +
                "from Material m, Supplier su ,Storagestock ss, Storage st " +
                "where m.supplyid = su.supplyid and st.id = ss.storageid and ss.materialid = m.id and m.id = " + id;
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<MaterialAndSupplier>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setMaterialId((Integer) objects[0]);
            materialAndSupplier.setSupplyid((Integer) objects[1]);
            materialAndSupplier.setMaterialName((String) objects[2]);
            materialAndSupplier.setMaterialType((String) objects[3]);
            materialAndSupplier.setSupplierName((String) objects[4]);
            materialAndSupplier.setNumber((Integer) objects[5]);
            materialAndSupplier.setStorageName((String) objects[6]);
            materialAndSupplier.setRemark((String) objects[7]);
            materialAndSupplier.setDate((String) objects[8]);
            materialAndSupplierList.add(materialAndSupplier);
        }
        return materialAndSupplierList;
    }

    /**
     * 根据Name查询
     *
     * @param name
     * @return
     */
    @Override
    public List<Material> findMaterialByName(String name) {
        String hql = "select id from Material";
        List list = this.getHibernateTemplate().find(hql);
        return list;
    }

    /**
     * 查询全部商品信息
     *
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllMaterialInform() {
        String hql = "select m.id, m.name, m.type, su.sname, ss.number, st.name, m.remark " +
                "from Material m, Supplier su ,Storagestock ss, Storage st " +
                "where m.supplyid = su.supplyid and st.id = ss.storageid and ss.materialid = m.id";
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<MaterialAndSupplier>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setMaterialId((Integer) objects[0]);
            materialAndSupplier.setMaterialName((String) objects[1]);
            materialAndSupplier.setMaterialType((String) objects[2]);
            materialAndSupplier.setSupplierName((String) objects[3]);
            materialAndSupplier.setNumber((Integer) objects[4]);
            materialAndSupplier.setStorageName((String) objects[5]);
            materialAndSupplier.setRemark((String) objects[6]);
            materialAndSupplierList.add(materialAndSupplier);
        }
        return materialAndSupplierList;
    }
}
