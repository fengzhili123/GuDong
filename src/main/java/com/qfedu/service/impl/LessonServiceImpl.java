package com.qfedu.service.impl;

import com.qfedu.dao.LessonMapper;
import com.qfedu.service.LessonService;
import com.qfedu.vo.VLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessonMapper dao;


    @Override
    public List<VLesson> findAll() {
        List<VLesson> list = dao.findAll();
        return list;
    }

    @Override
    public List<VLesson> findByType(int type) {
        List<VLesson> list = dao.findAllByType(type);
        return list;
    }

}
