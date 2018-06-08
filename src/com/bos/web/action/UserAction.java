package com.bos.web.action;

import com.bos.domain.User;
import com.bos.service.IUserService;
import com.bos.web.action.base.BaseAction;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Simon
 */

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{

    @Resource
    private IUserService userService;

    private String checkcode;

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    public String login() {
        // 生成的验证码
        String key = (String)ServletActionContext.getRequest().getSession().getAttribute("key");

        // 判断用户输入的验证码是否正确
        if (StringUtils.isNotBlank(checkcode) && checkcode.equals(key)) {
            // 验证码正确
            User user = userService.login(model);
            if (user != null) {
                // 登录成功，将User放入session域，跳转到系统首页
                ServletActionContext.getRequest().getSession().setAttribute("loginUser", user);
                return "home";
            } else {
                // 登录失败，设置错误提示信息，跳转到登录页面
                this.addActionError("用户名或密码错误");
                return "login";
            }
        } else {
            // 验证码错误，设置错误提示信息，跳转到登录页面
            this.addActionError("验证码错误");
            return "login";
        }
    }
}
