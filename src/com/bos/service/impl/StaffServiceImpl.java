package com.bos.service.impl;

import com.bos.dao.IStaffDao;
import com.bos.domain.Staff;
import com.bos.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Simon
 */
@Service
@Transactional
public class StaffServiceImpl implements IStaffService {
    /**
     * 注入dao
     */
    @Autowired
    private IStaffDao staffDao;

    /**
     * 添加取派员
     *
     * @param model
     */
    @Override
    public void save(Staff model) {
        staffDao.save(model);
    }
}
