package com.bos.web.action;

import com.bos.domain.Staff;
import com.bos.service.IStaffService;
import com.bos.web.action.base.BaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

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
     * 添加取派员
     * @return
     */
    public String add() {
        staffService.save(model);
        return "list";
    }
}
