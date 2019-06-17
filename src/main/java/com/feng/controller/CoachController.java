package com.feng.controller;

import com.feng.common.JsonBean;
import com.feng.pojo.Coach;
import com.feng.service.CoachService;
import com.feng.utils.JsonUtil;
import com.feng.vo.VCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    CoachService service;

    @RequestMapping("/list.do")
    public JsonBean findAll() {
        JsonBean bean = null;
        try {
            List<VCoach> list = service.findAll();
            bean = JsonUtil.writeJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/limitList.do")
    public JsonBean findLimit() {
        JsonBean bean = null;
        try {
            List<VCoach> list = service.findLimit();
            bean = JsonUtil.writeJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/details.do")
    public JsonBean details(String cName) {
        JsonBean bean = null;
        try {
            Coach coach = service.findByName(cName);
            bean = JsonUtil.writeJsonBean(1, coach);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }
}
