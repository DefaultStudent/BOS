package com.bos.dao.impl;

import com.bos.dao.IUserDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Simon
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{
    /**
     * 登录验证
     * @param username
     * @param password
     * @return
     */
    @Override
    public User findByUsernameAndPassword(String username, String password) {
        String hql = "FROM User u where u.username = ? and u.password = ?";
        List<User> list = (List<User>) this.getHibernateTemplate().find(hql, username, password);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
