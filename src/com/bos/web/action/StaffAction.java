package com.bos.web.action;

import com.bos.domain.Staff;
import com.bos.service.IStaffService;
import com.bos.utils.PageBean;
import com.bos.web.action.base.BaseAction;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;

/**
 * 取派员管理
 * @author Simon
 */
@Controller
@Scope("prototype")
public class StaffAction extends BaseAction<Staff> {

    /**
     * 注入Service
     */
    @Autowired
    private IStaffService staffService;

    /**
     * 页码
     */
    private int page;
    /**
     * 每页显示记录数
      */
    private int rows;

    public void setPage(int page) {
        this.page = page;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * 添加取派员
     * @return
     */
    public String add() {
        staffService.save(model);
        return "list";
    }

    /**
     * 分页查询方法
     * @throws java.io.IOException
     * @return
     */
    public String pageQuery() {
        PageBean pageBean = new PageBean();
        pageBean.setCurrentPage(page);
        pageBean.setPageSize(rows);
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Staff.class);
        pageBean.setDetachedCriteria(detachedCriteria);

        staffService.pageQuery(pageBean);
        // 将PageBean对象转化为JSON
        JSONObject jsonObject = JSONObject.fromObject(pageBean);
        String json = jsonObject.toString();
        ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
        try {
            ServletActionContext.getResponse().getWriter().print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "none";
    }
}
