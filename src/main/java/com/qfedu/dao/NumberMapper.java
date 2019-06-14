package com.qfedu.dao;

import com.qfedu.pojo.Number;

import java.util.Date;
import java.util.List;

public interface NumberMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Number record);

    int insertSelective(Number record);

    Number selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Number record);

    int updateByPrimaryKey(Number record);

    List<Number> selectByDay(String day);
}