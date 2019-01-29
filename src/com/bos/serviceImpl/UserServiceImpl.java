package com.bos.serviceImpl;

import com.bos.dao.IUserDao;
import com.bos.domain.User;
import com.bos.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    /**
     * 注册
     *
     * @param user
     */
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public User findById(String id) {
        return userDao.findById(id);
    }

    /**
     * 更新用户信息
     *
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<User> findAll() {
        List list = userDao.findAll();
        return list;
    }
}
