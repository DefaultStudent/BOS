package com.bos.daoImpl;

import com.bos.dao.IStorageStockDao;
import com.bos.domain.Storagestock;
import com.bos.domain.StoragestockTemp;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 */
@Repository
public class StorageStockDaoImpl extends BaseDaoImpl<Storagestock> implements IStorageStockDao {
    /**
     * 更新仓库-盘存信息
     *
     * @param materialid
     */
    @Override
    public void updateStorageStock(int materialid) {
        String hql = "update Storagestock set number = 0 where materialid = " + materialid;
        Session session = this.getSessionFactory().getCurrentSession();
        session.createQuery(hql).executeUpdate();
    }

    /**
     * 查询货物是否存在
     *
     * @param mid
     * @return
     */
    @Override
    public List<Storagestock> getMaterialId(int mid) {
        String hql = "SELECT materialid, number FROM Storagestock WHERE materialid = ?";
        List<Storagestock> list = (List<Storagestock>) this.getHibernateTemplate().find(hql, mid);
        return list;
    }

    /**
     * 获取商品是否存在 sysnumber = 0
     *
     * @param mid
     * @return
     */
    @Override
    public List<StoragestockTemp> sumMaterialNumberIns(int mid) {
        String hql = "SELECT SUM(s.number), m.name FROM Material m, Storagestock s " +
                "WHERE s.materialid = m.id AND m.id = ? AND s.systemnumber = 0 GROUP BY m.name";
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql, mid);
        List<StoragestockTemp> storagestockTemps = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            StoragestockTemp storagestockTemp = new StoragestockTemp();
            Long sum = (Long) objects[0];
            storagestockTemp.setSumIns(Integer.parseInt(sum.toString()));
            storagestockTemp.setMname((String) objects[1]);
            storagestockTemps.add(storagestockTemp);
        }
        return storagestockTemps;
    }

    /**
     * 检查商品是否存在 sysnumber = 1
     *
     * @param mid
     * @return
     */
    @Override
    public List<StoragestockTemp> sumMaterialNumberOut(int mid) {
        String hql = "SELECT SUM(s.number), m.name FROM Material m, Storagestock s " +
                "WHERE s.materialid = m.id AND m.id = ? AND s.systemnumber = 1 GROUP BY m.name";
        List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql, mid);
        List<StoragestockTemp> storagestockTemps = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object[] objects = list.get(i);
            StoragestockTemp storagestockTemp = new StoragestockTemp();
            Long sum = (Long) objects[0];
            storagestockTemp.setSumOut(Integer.parseInt(sum.toString()));
            storagestockTemp.setMname((String) objects[1]);
            storagestockTemps.add(storagestockTemp);
        }
        return storagestockTemps;
    }
}
