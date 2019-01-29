package com.bos.serviceImpl;

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

    /**
     * 根据id查询员工
     *
     * @param id
     * @return
     */
    @Override
    public User findStaffById(int id) {
        return userDao.findById(id);
    }

    /**
     * 更新员工信息
     *
     * @param user
     */
    @Override
    public void updateStaff(User user) {
        userDao.update(user);
    }

    /**
     * 删除员工信息
     *
     * @param user
     */
    @Override
    public void deleteStaff(User user) {
        userDao.delete(user);
    }
}
