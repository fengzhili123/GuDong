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
    public JsonBean login(String name, String password, HttpSession session){
        JsonBean bean = null;
        try {
            User user = service.login(name, password);
            session.setAttribute(StrUtil.LOGIN_USER,user);
            bean = JsonUtil.writeJsonBean(1, user);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

}
