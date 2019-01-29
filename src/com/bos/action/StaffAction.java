package com.bos.action;

import com.bos.domain.User;
import com.bos.service.IStaffService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Simon
 */
@Controller
@Scope("prototype")
public class StaffAction extends BaseAction<User>{

    @Resource
    private IStaffService staffService;

    /**
     * 添加员工
     * @return
     */
    public String addStaff() {
        staffService.addStaff(model);
        return SUCCESS;
    }

    /**
     * 根据id查询员工
     * @return
     */
    public String findStaffById() {
        int id = model.getId();
        User user = staffService.findStaffById(id);
        ServletActionContext.getRequest().getSession().setAttribute("staff", user);
        return SUCCESS;
    }

    /**
     * 更新员工信息
     * @return
     */
    public String updateStaff() {
        staffService.updateStaff(model);
        return SUCCESS;
    }

    public String deleteStaff() {
        staffService.deleteStaff(model);
        return SUCCESS;
    }
}
