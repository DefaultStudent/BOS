package com.bos.dao.impl;

import com.bos.dao.IStorageDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Storage;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 */
@Repository
public class StorageDaoImpl extends BaseDaoImpl<Storage> implements IStorageDao {

    /**
     * 添加仓库信息
     * @param storage
     */
    @Override
    public void saveStorage(Storage storage) {
        // 获取当前仓库编号最大值
        String hql = " select max(id) FROM Storage";
        List list = this.getHibernateTemplate().find(hql);
        // 将新增仓库的编号加一
        if (list == null || list.size() == 0) {
            storage.setId(0);
        } else {
            int id = (Integer) list.get(0) + 1;
            storage.setId(id);
        }
        this.getHibernateTemplate().save(storage);
    }

    /**
     * 更新库存
     *
     * @param number
     * @param storageId
     */
    @Override
    public void updateStorageNum(String number, int storageId) {
        String sql = "update Storage set materialnum = " + number + " where id = " + storageId;
        Session session = this.getSessionFactory().getCurrentSession();
        session.createQuery(sql).executeUpdate();
    }

    /**
     * 获取仓库信息
     *
     * @param id
     * @return
     */
    @Override
    public List<Storage> findBySId(int id) {
        String hql  = "FROM Storage WHERE id = ?";
        List<Storage> list = (List<Storage>) this.getHibernateTemplate().find(hql, id);
        return list;
    }

    /**
     * 查询仓库详细信息
     *
     * @param id
     * @return
     */
    @Override
    public List<MaterialAndSupplier> storageDetails(int id) {
        String hql = "SELECT ss.materialid, m.name, SUM(ss.number) FROM Material m, Storagestock ss, Storage s " +
                "WHERE m.id = ss.materialid AND ss.storageid = s.id AND ss.systemnumber = 0 AND s.id = ? GROUP BY m.id";
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql, id);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setMaterialId((Integer) objects[0]);
            materialAndSupplier.setMaterialName((String) objects[1]);
            materialAndSupplier.setNumber(Integer.parseInt(String.valueOf(objects[2])));
            materialAndSupplierList.add(materialAndSupplier);
        }
        return materialAndSupplierList;
    }

    /**
     * 查询仓库详细信息 systemId = 1
     *
     * @param id
     * @return
     */
    @Override
    public List<MaterialAndSupplier> storageOutDetail(int id) {
        String hql = "SELECT ss.materialid, m.name, SUM(ss.number) FROM Material m, Storagestock ss, Storage s " +
                "WHERE m.id = ss.materialid AND ss.storageid = s.id AND ss.systemnumber = 1 AND s.id = ? GROUP BY m.id";
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql, id);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setMaterialId((Integer) objects[0]);
            materialAndSupplier.setMaterialName((String) objects[1]);
            materialAndSupplier.setNumber(Integer.parseInt(String.valueOf(objects[2])));
            materialAndSupplierList.add(materialAndSupplier);
        }
        return materialAndSupplierList;
    }
}
