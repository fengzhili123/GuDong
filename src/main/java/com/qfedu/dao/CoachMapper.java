package com.qfedu.dao;

import com.qfedu.pojo.Coach;

public interface CoachMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Coach record);

    int insertSelective(Coach record);

    Coach selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Coach record);

    int updateByPrimaryKey(Coach record);
}