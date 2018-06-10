package com.bos.service;

import com.bos.domain.Staff;
import com.bos.utils.PageBean;

/**
 * @author Simon
 */
public interface IStaffService {
    /**
     * 添加取派员
     * @param model
     */
    public void save(Staff model);

    /**
     * 分页查询
     * @param pageBean
     */
    public void pageQuery(PageBean pageBean);
}
