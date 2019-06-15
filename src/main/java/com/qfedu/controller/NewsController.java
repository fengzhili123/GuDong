package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.service.LessonService;
import com.qfedu.service.NewsService;
import com.qfedu.utils.JsonUtil;
import com.qfedu.vo.VLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService service;

    @RequestMapping("/list.do")
    public JsonBean findAll(Integer page) {
        JsonBean bean = null;
        try {
            Map<String, Object> list = service.findByPage(page);
            bean = JsonUtil.writeJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtil.writeJsonBean(0, e.getMessage());
        }
        return bean;
    }

}
