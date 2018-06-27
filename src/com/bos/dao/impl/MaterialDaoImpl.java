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
     * 添加商品
     *
     * @param material
     */
    @Override
    public void saveMaterial(Material material) {
        // 获取当前商品编号最大值
        String hql = " select max(id) FROM Material";
        List list = this.getHibernateTemplate().find(hql);
        if (list.get(0) == null) {
            material.setId(1);
        }
        // 将新增商品的编号加一
        int id = (Integer) list.get(0) + 1;
        material.setId(id);
        this.getHibernateTemplate().save(material);
    }

    /**
     * 查询全部商品信息
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllMaterial() {
        String hql = "SELECT m.id, m.name, m.type, m.date, s.sname, m.remark, st.name, ss.number, ss.id, st.id " +
                "FROM Material m, Supplier s, Storage st, Instorage ss where s.supplyid = m.supplyid and " +
                "ss.storageid = st.id and ss.materialid=m.id";
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
            materialAndSupplier.setStoragename((String) objects[6]);
            materialAndSupplier.setMaterialnum((Long) objects[7]);
            materialAndSupplier.setInstorage((Integer) objects[8]);
            materialAndSupplier.setStorageid((Integer) objects[9]);
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
     * 库存增加
     *
     * @param id
     */
    @Override
    public void numAdd(int id, int num) {
        // 查询现库存
        String hql = "SELECT materialnum FROM Storage WHERE id = " + id;
        List list = this.getHibernateTemplate().find(hql);
        String num_1 = list.get(0).toString();
        // 增加库存量
        int numAdd = Integer.parseInt(num_1) + num;
        String hql_1 = "UPDATE Storage SET materialnum = " + numAdd + " WHERE id = " + id;
        Session session = this.getSessionFactory().getCurrentSession();
        session.createQuery(hql_1).executeUpdate();
    }

    /**
     * 库存减少
     *
     * @param id
     * @param num
     */
    @Override
    public void numSub(int id, int num) {
        // 查询现库存
        String hql = "SELECT materialnum FROM Storage WHERE id = " + id;
        try {
            List list = this.getHibernateTemplate().find(hql);
            String num_1 = list.get(0).toString();
            // 减少库存量
            int numSub = Integer.parseInt(num_1) - num;
            String hql_1 = "UPDATE Storage SET materialnum = " + numSub + " WHERE id = " + id;
            Session session = this.getSessionFactory().getCurrentSession();
            session.createQuery(hql_1).executeUpdate();
        } catch (Exception e) {
            System.out.println("删除失败");
            e.printStackTrace();
        }
    }

    /**
     * 更新商品库存信息
     *
     * @param num
     * @param reid  移出仓库编号
     * @param adid  移至仓库编号
     */
    @Override
    public int updateMaterialNum(Long num, int reid, int adid) {
        /**
         * 作为传递是否成功的标志
         * 1 失败
         * 0 成功
         */
        int flag;

        /**
         * 设置仓库最大容量为100
         *
         * 这里设计数据库时欠考虑，只能将库存最大值写死为100
         * 日后可扩展为动态
         */
        int maxNum = 100;

        // 查询将要移出货物的仓库的库存
        String hql = "SELECT materialnum FROM Storage WHERE id = " + reid;
        List list = this.getHibernateTemplate().find(hql);
        String reNowNum = list.get(0).toString();
        // 减少相应的库存
        Long delNum = Integer.parseInt(reNowNum) - num;
        String removeHql = "UPDATE Storage SET materialnum = " + delNum + " WHERE id = " + reid;

        // 获取将要移至的仓库的库存
        String hql1 = "SELECT materialnum FROM Storage WHERE id = " + adid;
        List list1 = this.getHibernateTemplate().find(hql1);
        String adNowNum = list1.get(0).toString();
        // 添加相应的库存
        Long adNum = Integer.parseInt(adNowNum) + num;
        // 是否大于仓库容量
        if (adNum > maxNum) {
            // 大于最大值，不执行任何更新语句，返回失败状态值
            flag = 1;
            return flag;
        } else {
            // 添加相应的库存
            String addHql = "UPDATE Storage SET materialnum = " + adNum + " WHERE id = " + adid;

            // 更新两个仓库的库存
            Session session = this.getSessionFactory().getCurrentSession();
            session.createQuery(removeHql).executeUpdate();
            session.createQuery(addHql).executeUpdate();

            // 返回成功状态值
            flag = 0;
            return flag;
        }
    }
}
