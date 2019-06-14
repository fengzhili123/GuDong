package com.qfedu.service;

import com.qfedu.pojo.Coach;
import com.qfedu.pojo.User;
import com.qfedu.vo.VCoach;

import java.util.List;

public interface CoachService {
    public List<VCoach> findAll();

    public List<VCoach> findLimit();

    public Coach findByName(String cName);

}
