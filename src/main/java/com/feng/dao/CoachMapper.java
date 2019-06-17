package com.feng.dao;

import com.feng.pojo.Coach;
import com.feng.vo.VCoach;

import java.util.List;

public interface CoachMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Coach record);

    int insertSelective(Coach record);

    Coach selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Coach record);

    int updateByPrimaryKey(Coach record);

    List<VCoach> findAll();

    List<VCoach> findLimit();

    Coach findByName(String cName);
}