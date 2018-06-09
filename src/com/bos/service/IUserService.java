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
}
