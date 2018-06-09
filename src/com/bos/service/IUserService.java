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
     * 修改密码
     * @param password
     * @param id
     */
    public void editPassword(String password, String id);
}
