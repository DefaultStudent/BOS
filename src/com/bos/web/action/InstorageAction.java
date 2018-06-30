package com.bos.web.action;

import com.bos.domain.Instorage;
import com.bos.domain.User;
import com.bos.service.*;
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
public class InstorageAction extends BaseAction<Instorage> {

    @Resource
    InStorageService inStorageService;

    @Resource
    IMaterialService materialService;

    @Resource
    IStockService stockService;

    @Resource
    IStorageService storageService;

    @Resource
    IStorageStockService storageStockService;

    /**
     * 添加进货信息
     * @return
     */
    public String saveInstorageInform() {

        String date = model.getDate();

        Long number = model.getNumber();
        String numberString = String.valueOf(number);
        int numberInt = Integer.parseInt(numberString);

        int materialId = Integer.parseInt(ServletActionContext.getRequest().getParameter("materialid"));

        int storageId = model.getId();

        String remark = model.getRemark();

        // 获取操作人员id
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
        int userid = user.getId();

        // 代表本批次商品首次入库
        int outstorageId = 0;

        inStorageService.saveInstorage(date, materialId, number, userid, storageId, remark);

        storageService.addStorageMaterialNum(storageId, numberString);

        stockService.saveStock(date, outstorageId, remark);

        storageStockService.saveStorageStock(storageId, materialId, numberInt);

        return SUCCESS;
    }

    /**
     * 查询全部进货信息
     * @return
     */
    public String findAllInstorage() {
        List list = inStorageService.findAll();
        ServletActionContext.getRequest().getSession().setAttribute("findAllInstorage", list);
        return SUCCESS;
    }
}
