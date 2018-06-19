package com.bos.service.impl;

import com.bos.dao.IUserDao;
import com.bos.domain.User;
import com.bos.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Simon
 */
@Service
@Transactional
public class StaffServiceImpl implements IStaffService {

    @Autowired
    private IUserDao userDao;
    /**
     * 添加员工
     *
     * @param user
     */
    @Override
    public void addStaff(User user) {
        userDao.save(user);
    }
}
