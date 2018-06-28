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
        String hql = "SELECT m.id, m.name, m.type, m.date, s.id, s.sname, m.remark, st.name, ss.number, ss.id, st.id " +
                "FROM Material m, Supplier s, Storage st, Instorage ss where s.supplyid = m.supplyid and " +
                "ss.storageid = st.id and ss.materialid=m.id and m.id = " + id;
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<MaterialAndSupplier>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setId((Integer) objects[0]);
            materialAndSupplier.setName((String) objects[1]);
            materialAndSupplier.setType((String) objects[2]);
            materialAndSupplier.setDate((String) objects[3]);
            materialAndSupplier.setSupplyid((Integer) objects[4]);
            materialAndSupplier.setSname((String) objects[5]);
            materialAndSupplier.setRemark((String) objects[6]);
            materialAndSupplier.setStoragename((String) objects[7]);
            materialAndSupplier.setMaterialnum((Long) objects[8]);
            materialAndSupplier.setInstorage((Integer) objects[9]);
            materialAndSupplier.setStorageid((Integer) objects[10]);
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
}
