package com.bos.dao.impl;

import com.bos.dao.InstorageDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.Instorage;
import com.bos.domain.MaterialAndSupplier;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 */
@Repository
public class InstorageDaoImpl extends BaseDaoImpl<Instorage> implements InstorageDao {
    /**
     * 查询进货单编号
     * @return
     */
    @Override
    public int findInstorageId() {
        // 获取当前仓库编号最大值
        String hql = " select max(id) FROM Instorage ";
        List list = this.getHibernateTemplate().find(hql);
        if (list.isEmpty()) {
            return 0;
        } else {
            int id = (Integer) list.get(0);
            return id;
        }
    }

    /**
     * 查询全部进货信息
     *
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllInstorage() {
        String hql = "SELECT m.name, i.id, i.date, i.number, u.username, s.name, i.remark" +
                " FROM Material m, Instorage i, User u, Storage s " +
                "where m.id = i.materialid and u.id = i.userid and s.id = i.storageid";
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<MaterialAndSupplier>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setMaterialName((String) objects[0]);
            materialAndSupplier.setInstorageId((Integer) objects[1]);
            materialAndSupplier.setDate((String) objects[2]);
            String number = String.valueOf((Long) objects[3]);
            materialAndSupplier.setNumber(Integer.parseInt(number));
            materialAndSupplier.setUsername((String) objects[4]);
            materialAndSupplier.setStorageName((String) objects[5]);
            materialAndSupplier.setRemark((String) objects[6]);
            materialAndSupplierList.add(materialAndSupplier);
        }
        return materialAndSupplierList;
    }
}
