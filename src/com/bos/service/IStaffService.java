package com.bos.service;

import com.bos.domain.User;

/**
 * Simon
 */
public interface IStaffService {
    /**
     * 添加员工
     * @param model
     */
    public void addStaff(User model);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    public User findStaffById(int id);

    /**
     * 更新员工信息
     * @param model
     */
    public void updateStaff(User model);

    /**
     * 删除员工信息
     * @param model
     */
    public void deleteStaff(User model);
}
