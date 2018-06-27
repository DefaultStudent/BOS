package com.bos.dao.impl;

import com.bos.dao.IMaterialDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Storage;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 */
@Repository
public class MaterialDaoImpl extends BaseDaoImpl<Material> implements IMaterialDao{

    /**
     * 查询全部商品信息
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllMaterial() {
        String hql = "SELECT m.id, m.name, m.type, m.date, s.sname, m.remark " +
                "FROM Material m, Supplier s where s.supplyid = m.supplyid";
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<MaterialAndSupplier>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setId((Integer) objects[0]);
            materialAndSupplier.setName((String) objects[1]);
            materialAndSupplier.setType((String) objects[2]);
            materialAndSupplier.setDate((String) objects[3]);
            materialAndSupplier.setSname((String) objects[4]);
            materialAndSupplier.setRemark((String) objects[5]);
            materialAndSupplierList.add(materialAndSupplier);
        }
        return materialAndSupplierList;
    }

    /**
     * 根据编号查询商品信息
     *
     * @param id
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findMaterialById(int id) {
        String hql = "SELECT m.id, m.name, m.type, m.date, s.sname, m.remark, m.supplyid, st.id, st.name FROM " +
                "Material m, Supplier s, Storage st where s.supplyid = m.supplyid and m.id =" + id;
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
        List<MaterialAndSupplier> materialAndSupplierList = new ArrayList<MaterialAndSupplier>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
            materialAndSupplier.setId((Integer) objects[0]);
            materialAndSupplier.setName((String) objects[1]);
            materialAndSupplier.setDate((String) objects[3]);
            materialAndSupplier.setSname((String) objects[4]);
            materialAndSupplier.setRemark((String) objects[5]);
            materialAndSupplier.setSupplyid((Integer) objects[6]);
            materialAndSupplierList.add(materialAndSupplier);
        }
        return materialAndSupplierList;
    }

    /**
     * 库存加一
     *
     * @param id
     */
    @Override
    public void numAdd(int id, int num) {
        String hql = "SELECT materialnum FROM Storage WHERE id = " + id;
        List list = this.getHibernateTemplate().find(hql);
        String num_1 = list.get(0).toString();
        int numAdd = Integer.parseInt(num_1) + num;
        String hql_1 = "UPDATE Storage SET materialnum = " + numAdd + " WHERE id = " + id;
        Session session = this.getSessionFactory().getCurrentSession();
        session.createQuery(hql_1).executeUpdate();
    }

    /**
     * 库存减一
     *
     * @param id
     */
    @Override
    public void numSub(int id) {
        String hql = "SELECT materialnum FROM Storage WHERE id = " + id;
        List list = this.getHibernateTemplate().find(hql);
        String num = list.get(0).toString();
        int numSub = Integer.parseInt(num) - 1;
        String hql_1 = "UPDATE Storage SET materialnum = " + numSub + " WHERE id = " + id;
        Session session = this.getSessionFactory().getCurrentSession();
        session.createQuery(hql_1).executeUpdate();
    }
}
