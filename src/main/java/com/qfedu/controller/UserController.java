package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.utils.JsonUtil;
import com.qfedu.utils.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/login.do")
    public JsonBean login(String username, String password, HttpSession session) {
        JsonBean bean = null;
        try {
            User user = service.login(username, password);
            session.setAttribute(StrUtil.LOGIN_USER, user);
            bean = JsonUtil.writeJsonBean(1, user);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/register.do")
    public JsonBean login(User user) {
        JsonBean bean = null;
        try {
            service.register(user);
            bean = JsonUtil.writeJsonBean(1, "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/welcome.do")
    public JsonBean welcome(HttpSession session) {
        JsonBean bean = null;
        try {
            User user = (User) session.getAttribute(StrUtil.LOGIN_USER);
            if (user != null) {
                bean = JsonUtil.writeJsonBean(1, user);
            } else {
                bean = JsonUtil.writeJsonBean(0, "请登录");
            }
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/out.do")
    public JsonBean out(HttpSession session) {
        JsonBean bean = null;
        try {
            session.invalidate();
            bean = JsonUtil.writeJsonBean(1, "退出成功！");
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

}
