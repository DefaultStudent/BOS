package com.bos.web.action;

import com.bos.domain.User;
import com.bos.service.IUserService;
import com.bos.utils.MD5Utils;
import com.bos.web.action.base.BaseAction;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.IOException;

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
        return "login";
    }

    /**
     * 修改当前登录用户的密码
     * @throws java.io.IOException
     * @return
     */
    public String editPassword() {
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
        // 新密码
        String password = model.getPassword();
        String flag = "1";
        try {
            userService.editPassword(password, user.getId());
        } catch (Exception e) {
            // 修改密码失败
            flag = "0";
        }
        ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
        try {
            ServletActionContext.getResponse().getWriter().print(flag);
            String pwd = user.getPassword();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "none";
    }
}
