package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Number;
import com.qfedu.service.NewsService;
import com.qfedu.service.NumberService;
import com.qfedu.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
