package com.qfedu.service;

import com.qfedu.pojo.Number;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface NumberService {
    public List<Number> selectByDay(String day);

    public List<Integer> number();
}

