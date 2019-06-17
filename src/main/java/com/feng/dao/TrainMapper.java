package com.feng.dao;

import com.feng.pojo.Train;

public interface TrainMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(Train record);

    int insertSelective(Train record);

    Train selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Train record);

    int updateByPrimaryKey(Train record);
}