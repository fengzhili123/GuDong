package com.qfedu.dao;

import com.qfedu.pojo.Lesson;
import com.qfedu.vo.VLesson;

import java.util.List;

public interface LessonMapper {
    int deleteByPrimaryKey(Integer lId);

    int insert(Lesson record);

    int insertSelective(Lesson record);

    Lesson selectByPrimaryKey(Integer lId);

    int updateByPrimaryKeySelective(Lesson record);

    int updateByPrimaryKey(Lesson record);

    List<VLesson> findAll();

    List<VLesson> findAllByType(int type);
}