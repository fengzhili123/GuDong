package com.feng.service.impl;

import com.feng.dao.NumberMapper;
import com.feng.pojo.Number;
import com.feng.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    private NumberMapper dao;

    @Override
    public List<Number> selectByDay(String day) {
        List<Number> list = dao.selectByDay(day);
        return list;
    }

    @Override
    public List<Integer> number() {
        List<Integer> list = new ArrayList<>();
        String[] time = new String[]{
                "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00"
        };
        Integer num = 0;
        for (int i = 0; i < time.length; i++) {
            num = dao.selectByDay(time[i]).get(0).getMan() + dao.selectByDay(time[i]).get(0).getWoman();
            list.add(num);
        }
        return list;
    }
}
