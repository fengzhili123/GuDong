package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.vo.VLesson;

import java.util.List;

public interface LessonService {
    public List<VLesson> findAll();

    public List<VLesson> findByType(int type);

}
