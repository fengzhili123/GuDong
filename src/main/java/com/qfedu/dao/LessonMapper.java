package com.qfedu.dao;

import com.qfedu.pojo.Lesson;

public interface LessonMapper {
    int deleteByPrimaryKey(Integer lId);

    int insert(Lesson record);

    int insertSelective(Lesson record);

    Lesson selectByPrimaryKey(Integer lId);

    int updateByPrimaryKeySelective(Lesson record);

    int updateByPrimaryKey(Lesson record);
}