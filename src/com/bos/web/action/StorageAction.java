package com.bos.web.action;

import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.Storage;
import com.bos.service.IStorageService;
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
public class StorageAction extends BaseAction<Storage> {

    @Resource
    private IStorageService storageService;

    /**
     * 查询仓库信息
     * @return
     */
    public String findAllStorage() {
        List list = storageService.findAllStorage();
        if (list.size() > 0) {
            ServletActionContext.getRequest().getSession().setAttribute("storage", list);
            return SUCCESS;
        } else {
            return NONE;
        }
    }

    /**
     * 添加仓库信息
     * @return
     */
    public String addStorage() {
        storageService.addStorage(model);
        return SUCCESS;
    }

    /**
     * 根据Id查询仓库信息
     * @return
     */
    public String findStorageById() {
        int id = model.getId();
        Storage storage = storageService.findStorageById(id);
        ServletActionContext.getRequest().getSession().setAttribute("storageById", storage);
        return SUCCESS;
    }

    /**
     * 更新仓库信息
     * @return
     */
    public String updateStorage() {
        storageService.updateStorage(model);
        return SUCCESS;
    }

    /**
     * 删除仓库信息
     * @return
     */
    public String deleteStorage() {
        storageService.deleteStorage(model);
        return SUCCESS;
    }

    /**
     * 查询仓库详细信息
     * @return
     */
    public String strageDetail() {
        int id = model.getId();
        try {
            List<MaterialAndSupplier> list = storageService.storageDetail(id);
            ServletActionContext.getRequest().getSession().setAttribute("details", list);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }
}
