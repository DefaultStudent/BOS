package com.bos.dao;

import com.bos.dao.base.IBaseDao;
import com.bos.domain.User;

/**
 * @author Simon
 */

public interface IUserDao extends IBaseDao<User>{
    /**
     * 登录验证
     * @param username
     * @param password
     * @return
     */
    public User findByUsernameAndPassword(String username, String password);
}
