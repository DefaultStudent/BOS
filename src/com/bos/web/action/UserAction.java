package com.bos.web.action;

import com.bos.domain.User;
import com.bos.service.IUserService;
import com.bos.web.action.base.BaseAction;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * @author Simon
 */

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{

    @Resource
    private IUserService userService;

    /**
     * 登录
     * @return
     */
    public String login() {
        User user = userService.login(model);
        if (user != null) {
            // 登录成功，将User放入session域，跳转到系统首页
            ServletActionContext.getRequest().getSession().setAttribute("loginUser", user);
            return "home";
        } else {
            // 登录失败，设置错误提示信息，跳转到登录页面
            this.addActionError(this.getText("loginError"));
            return "login";
        }
    }

    /**
     * 用户退出
     * @return
     */
    public String logout() {
        // 销毁session
        ServletActionContext.getRequest().getSession().invalidate();
        return "logout";
    }

    /**
     * 注册
     * @return
     */
    public String signIn() {
        userService.save(model);
        return SUCCESS;
    }

    /**
     * 根据Id查询
     * @return
     */
    public String findById() {
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
        ServletActionContext.getRequest().getSession().setAttribute("profile", user);
        return SUCCESS;
    }

    /**
     * 修改用户信息
     * @return
     */
    public String updateUser() {
        userService.updateUser(model);
        return SUCCESS;
    }

    /**
     * 查询全部员工信息
     * @return
     */
    public String findAll() {
        List list = userService.findAll();
        if (list.size() > 0) {
            ServletActionContext.getRequest().getSession().setAttribute("findAllUser", list);
        }
        return SUCCESS;
    }
}
