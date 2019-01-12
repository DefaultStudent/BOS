package com.bos.web.action;

import com.bos.domain.Outstorage;
import com.bos.domain.User;
import com.bos.service.IMaterialService;
import com.bos.service.IOutStorageService;
import com.bos.web.action.base.BaseAction;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Simon
 */
@Controller
@Scope("prototype")
public class OutsotrageAction extends BaseAction<Outstorage> {

    @Resource
    IOutStorageService outStorageService;
    @Resource
    IMaterialService materialService;

    /**
     * 添加出货信息
     * @return
     */
    public String saveOutstorageInfom() {
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
        int userid = user.getId();
        String date = model.getDate();
        int storageid = Integer.parseInt(ServletActionContext.getRequest().getParameter("storageid"));
        Long num = model.getNumber();
        String numString = String.valueOf(num);
        int numInt = Integer.parseInt(numString);
        String remark = model.getRemark();

        int materialId = Integer.parseInt(ServletActionContext.getRequest().getParameter("materialid"));

        outStorageService.saveOutstorageInfo(date, materialId, num, userid, storageid, remark);
        return SUCCESS;
    }

    public String findAllInstorage() {
        List list = outStorageService.findAllOutStorageInfo();
        if (list.size() == 0 && list == null) {
            return ERROR;
        } else {
            ServletActionContext.getRequest().getSession().setAttribute("findAllOutstorage", list);
            return SUCCESS;
        }
    }
}
