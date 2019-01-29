package com.bos.action;

import com.bos.domain.Supplier;
import com.bos.service.ISupplierService;
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
public class SupplierAction extends BaseAction<Supplier> {

    @Resource
    private ISupplierService supplierService;

    /**
     * 查询全部供应商信息
     * @return
     */
    public String findAllSupplier() {
        List list = supplierService.findAllSupplier();
        if (list.size() > 0) {
            ServletActionContext.getRequest().getSession().setAttribute("findAllSupplier", list);
            return SUCCESS;
        } else {
            return NONE;
        }
    }

    /**
     * 添加供应商信息
     * @return
     */
    public String saveSupplier() {
        supplierService.saveSupplier(model);
        return SUCCESS;
    }

    /**
     * 根据id查询供应商信息
     * @return
     */
    public String findSupplierById() {
        int id = model.getSupplyid();
        Supplier supplier = supplierService.findSupplierById(id);
        ServletActionContext.getRequest().getSession().setAttribute("supplierById", supplier);
        return SUCCESS;
    }

    /**
     * 更新供应商信息
     * @return
     */
    public String updateSupplier() {
        supplierService.updateSupplier(model);
        return SUCCESS;
    }

    /**
     * 删除供应商信息
     * @return
     */
    public String deleteSupplier() {
        supplierService.deleteSupplier(model);
        return SUCCESS;
    }
}
