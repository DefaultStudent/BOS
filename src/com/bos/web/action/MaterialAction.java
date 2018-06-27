package com.bos.web.action;

import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.User;
import com.bos.service.IMaterialService;
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
public class MaterialAction extends BaseAction<Material> {

    @Resource
    private IMaterialService materialService;

    /**
     * 查询全部商品信息
     * @return
     */
    public String findAllMaterial() {
        List<MaterialAndSupplier> list = materialService.findAllMaterial();
        if (list.size() > 0) {
            ServletActionContext.getRequest().getSession().setAttribute("ma", list);
            return SUCCESS;
        } else {
            return NONE;
        }
    }

    /**
     * 根据id查询
     * @return
     */
    public String findMaterialById() {
        int id = model.getId();
        MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
        List<MaterialAndSupplier> list = materialService.findMaterialById(id);
        for (MaterialAndSupplier materialAndSuppliers : list) {
            materialAndSupplier.setId(materialAndSuppliers.getId());
            materialAndSupplier.setName(materialAndSuppliers.getName());
            materialAndSupplier.setType(materialAndSuppliers.getType());
            materialAndSupplier.setDate(materialAndSuppliers.getDate());
            materialAndSupplier.setSname(materialAndSuppliers.getSname());
            materialAndSupplier.setRemark(materialAndSuppliers.getRemark());
            materialAndSupplier.setSupplyid(materialAndSuppliers.getSupplyid());
        }
        ServletActionContext.getRequest().getSession().setAttribute("mas", materialAndSupplier);
        return SUCCESS;
    }

    /**
     * 添加商品信息
     * @return
     */
    public String saveMaterial() {
        // 获取仓库id
        String id = ServletActionContext.getRequest().getParameter("storageid");
        int storageId = Integer.parseInt(id);

        // 获取操作人员id
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
        int userid = user.getId();

        // 获取添加数量
        int number = Integer.parseInt(ServletActionContext.getRequest().getParameter("number"));
        Long num = new Long(number);

        // 获取备注
        String remark = ServletActionContext.getRequest().getParameter("remark");

        // 添加信息
        materialService.addMaterial(model, userid,storageId, num, remark);
        return SUCCESS;
    }

    /**
     * 删除商品信息
     * @return
     */
    public String deleteMaterial() {
        String id = ServletActionContext.getRequest().getParameter("");
        int storageId = Integer.parseInt(id);
        materialService.deleteMaterial(model, storageId);
        return SUCCESS;
    }

}
