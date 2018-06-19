package com.bos.web.action;

import com.bos.domain.User;
import com.bos.service.IStaffService;
import com.bos.web.action.base.BaseAction;
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
}
