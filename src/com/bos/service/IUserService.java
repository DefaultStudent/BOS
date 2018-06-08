package com.bos.service;

import com.bos.domain.User;

/**
 * @author Simon
 */
public interface IUserService {
    /**
     * 登录
     * @param user
     * @return
     */
    public User login(User user);
}
