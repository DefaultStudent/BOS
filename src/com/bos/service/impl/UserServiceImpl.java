package com.bos.service.impl;

import com.bos.dao.IUserDao;
import com.bos.domain.User;
import com.bos.service.IUserService;
import com.bos.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Simon
 */

@Service
@Transactional
public class UserServiceImpl implements IUserService{

    /**
     * 注入dao
     */
    @Autowired
    private IUserDao userDao;

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        String username = user.getUsername();
        // 明文
        String password = user.getPassword();

        return userDao.findByUsernameAndPassword(username, password);
    }
}
