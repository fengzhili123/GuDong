package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Lesson;
import com.qfedu.pojo.User;
import com.qfedu.service.LessonService;
import com.qfedu.service.UserService;
import com.qfedu.utils.JsonUtil;
import com.qfedu.utils.StrUtil;
import com.qfedu.vo.VLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

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
