package com.qfedu.dao;

import com.qfedu.pojo.Number;

public interface NumberMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Number record);

    int insertSelective(Number record);

    Number selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Number record);

    int updateByPrimaryKey(Number record);
}