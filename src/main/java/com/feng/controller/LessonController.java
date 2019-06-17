package com.feng.controller;

import com.feng.common.JsonBean;
import com.feng.service.LessonService;
import com.feng.utils.JsonUtil;
import com.feng.vo.VLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/lesson")
public class LessonController {
    @Autowired
    LessonService service;

    @RequestMapping("/list.do")
    public JsonBean findAll(Integer type) {
        JsonBean bean = null;
        try {
            List<VLesson> list = service.findByType(type);
            bean = JsonUtil.writeJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

}
