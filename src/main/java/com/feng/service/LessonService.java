package com.feng.service;

import com.feng.vo.VLesson;

import java.util.List;

public interface LessonService {
    public List<VLesson> findAll();

    public List<VLesson> findByType(int type);

}
