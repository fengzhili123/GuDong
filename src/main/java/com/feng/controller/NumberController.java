package com.feng.controller;

import com.feng.common.JsonBean;
import com.feng.pojo.Number;
import com.feng.service.NumberService;
import com.feng.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/number")
public class NumberController {
    @Autowired
    NumberService service;

    @RequestMapping("/day.do")
    public JsonBean findByDay(String day) {
        JsonBean bean = null;
        try {
            List<Number> list = service.selectByDay(day);
            bean = JsonUtil.writeJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }
}
