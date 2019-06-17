package com.feng.service.impl;

import com.feng.dao.CoachMapper;
import com.feng.pojo.Coach;
import com.feng.service.CoachService;
import com.feng.vo.VCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachServiceImpl implements CoachService {

    @Autowired
    private CoachMapper dao;

    @Override
    public List<VCoach> findAll() {
        List<VCoach> list = dao.findAll();
        return list;
    }

    @Override
    public List<VCoach> findLimit() {
        List<VCoach> list = dao.findLimit();
        return list;
    }

    @Override
    public Coach findByName(String cName) {
        Coach coach = dao.findByName(cName);
        return coach;
    }
}
