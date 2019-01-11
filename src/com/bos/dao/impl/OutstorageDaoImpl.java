package com.bos.dao.impl;

import com.bos.dao.IOutstorageDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Outstorage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 */
@Repository
public class OutstorageDaoImpl extends BaseDaoImpl<Outstorage> implements IOutstorageDao {

    /**
     * 查询全部出库信息
     *
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllOutStorage() {
        String hql = "SELECT m.name, o.id, o.date, o.number, u.username, s.name, o.remark" +
                " FROM Material m, Outstorage o, User u, Storage s WHERE m.id = o.materialid and u.id = o.userid and s.id = i.storageid";
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setMaterialName((String) objects[0]);
            materialAndSupplier.setOutstorageId((Integer) objects[1]);
            materialAndSupplier.setDate((String) objects[2]);
            String num = String.valueOf(objects[3]);
            materialAndSupplier.setNumber(Integer.parseInt(num));
            materialAndSupplier.setUsername((String) objects[4]);
            materialAndSupplier.setStorageName((String) objects[5]);
            materialAndSupplier.setRemark((String) objects[6]);
            materialAndSupplierList.add(materialAndSupplier);
        }

        return materialAndSupplierList;
    }
}
