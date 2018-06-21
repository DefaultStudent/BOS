package com.bos.web.action;

import com.bos.domain.Material;
import com.bos.service.IMaterialService;
import com.bos.web.action.base.BaseAction;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Simon
 */
@Controller
@Scope("prototype")
public class MaterialAction extends BaseAction<Material> {

    @Autowired
    private IMaterialService materialService;

    public String findAllMaterial() {
        List list = materialService.findAllMaterial();
        if (list.size() > 0) {
            ServletActionContext.getRequest().getSession().setAttribute("material", list);
            return SUCCESS;
        } else {
            return NONE;
        }
    }

}
