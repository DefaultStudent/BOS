package com.bos.web.interceptor;

import com.bos.domain.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * 自定义Struts2的拦截器，实现用户未登录，自动跳转到登录页面
 * @author Simon
 */
@SuppressWarnings("ALL")
public class BOSLoginInterceptor extends MethodFilterInterceptor {
    /**
     * 拦截方法
     * @param actionInvocation
     * @return
     * @throws Exception
     */
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
        if (user == null) {
            // 未登录，跳转至登录页面
            return "login";
        }
        // 放行
        return actionInvocation.invoke();
    }
}
