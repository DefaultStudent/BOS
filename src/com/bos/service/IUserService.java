package com.bos.service;

import com.bos.domain.User;

/**
 * @author Simon
 */
public interface IUserService {
    /**
     * 登录
     * @param model
     * @return
     */
    public User login(User model);

    /**
     * 注册
     * @param model
     */
    public void save(User model);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public User findById(String id);

    /**
     * 更新用户信息
     * @param model
     */
    public void updateUser(User model);
}
