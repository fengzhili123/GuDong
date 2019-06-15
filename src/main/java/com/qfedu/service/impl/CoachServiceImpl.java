package com.qfedu.service.impl;

import com.qfedu.dao.CoachMapper;
import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.Coach;
import com.qfedu.pojo.User;
import com.qfedu.service.CoachService;
import com.qfedu.service.UserService;
import com.qfedu.vo.VCoach;
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
