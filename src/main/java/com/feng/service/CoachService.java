package com.feng.service;

import com.feng.pojo.Coach;
import com.feng.vo.VCoach;

import java.util.List;

public interface CoachService {
    public List<VCoach> findAll();

    public List<VCoach> findLimit();

    public Coach findByName(String cName);

}
