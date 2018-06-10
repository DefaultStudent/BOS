package com.bos.utils;

import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

/**
 * 封装分页信息
 * @author Simon
 */

public class PageBean {
    /**
     * 当前页码
     */
    private int currentPage;
    /**
     * 每页显示记录数
     */
    private int pageSize;
    /**
     * 总记录数
     */
    private int total;
    /**
     * 离线条件查询对象，包装查询条件
     */
    private DetachedCriteria detachedCriteria;
    /**
     * 当前页需要展示的数据的集合
     */
    private List rows;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public DetachedCriteria getDetachedCriteria() {
        return detachedCriteria;
    }

    public void setDetachedCriteria(DetachedCriteria detachedCriteria) {
        this.detachedCriteria = detachedCriteria;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
