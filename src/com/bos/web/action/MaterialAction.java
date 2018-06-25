package com.bos.web.action;

import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
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
        String id = ServletActionContext.getRequest().getParameter("storageid");
        int storageId = Integer.parseInt(id);
        materialService.addMaterial(model, storageId);
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
