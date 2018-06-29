package com.bos.web.action;

import com.bos.domain.Material;
import com.bos.domain.MaterialAndSupplier;
import com.bos.domain.User;
import com.bos.service.IMaterialService;
import com.bos.service.IStockService;
import com.bos.service.IStorageStockService;
import com.bos.service.InStorageService;
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

    @Resource
    private InStorageService storageService;

    @Resource
    private IStockService stockService;

    @Resource
    private IStorageStockService storageStockService;

    /**
     * 添加商品
     * @return
     */
    public String saveMaterial() {
        // 获取日期
        String date = model.getDate();
        // 获取商品名称
        String materialName = model.getName();
        // 获取进货数量
        int number = Integer.parseInt(ServletActionContext.getRequest().getParameter("number"));
        Long numberLong = new Long(number);
        // 获取操作人员id
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
        int userid = user.getId();
        // 获取仓库编号
        int storageid = Integer.parseInt(ServletActionContext.getRequest().getParameter("storageid"));
        // 获取备注
        String remark = model.getRemark();
        // 设置出库表id
        int outstorageid = 0;

        // 添加商品信息
        materialService.save(model);

        // 获取materialid
        String id = materialService.findMaterialByName(materialName).get(0).toString();
        int materialid = Integer.parseInt(id);

        // 添加入库明细信息
        storageService.saveInstorage(date, materialid, numberLong, userid, storageid, remark);
        // 添加盘存信息
        stockService.saveStock(date, outstorageid, remark);
        // 添加仓库-盘存信息
        storageStockService.saveStorageStock(storageid, materialid, number);

        return SUCCESS;
    }

    /**
     * 查询全部商品信息
     * @return
     */
    public String findAllMaterial() {
        List<MaterialAndSupplier> list = materialService.findAllMaterialInform();
        if (list.size() > 0) {
            ServletActionContext.getRequest().getSession().setAttribute("ma", list);
            return SUCCESS;
        } else {
            return  NONE;
        }
    }

    /**
     * 根据id查询商品信息
     * @return
     */
    public String findMaterialInformById() {
        int id = model.getId();
        MaterialAndSupplier materialAndSupplier = new MaterialAndSupplier();
        List<MaterialAndSupplier> list = materialService.findMaterialInformById(id);
        for (MaterialAndSupplier materialAndSuppliers : list) {
            materialAndSupplier.setMaterialId(materialAndSuppliers.getMaterialId());
            materialAndSupplier.setMaterialName(materialAndSuppliers.getMaterialName());
            materialAndSupplier.setMaterialType(materialAndSuppliers.getMaterialType());
            materialAndSupplier.setSupplierName(materialAndSuppliers.getSupplierName());
            materialAndSupplier.setDate(materialAndSuppliers.getDate());
            materialAndSupplier.setSupplyid(materialAndSuppliers.getSupplyid());
            materialAndSupplier.setRemark(materialAndSuppliers.getRemark());
        }
        ServletActionContext.getRequest().getSession().setAttribute("mas", materialAndSupplier);
        return SUCCESS;
    }

    public String updateMaterial() {
        materialService.updateMaterial(model);
        return SUCCESS;
    }
}
