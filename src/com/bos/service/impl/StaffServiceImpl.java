package com.bos.service.impl;

import com.bos.dao.IStaffDao;
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
}
