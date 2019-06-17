package com.feng.service;

import com.feng.pojo.Number;

import java.util.List;

public interface NumberService {
    public List<Number> selectByDay(String day);

    public List<Integer> number();
}

