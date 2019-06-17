package com.feng.service.impl;

import com.feng.dao.UserMapper;
import com.feng.pojo.User;
import com.feng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper dao;

    @Override
    public User login(String name, String password) {
        System.out.println("------------------------------------------");
        System.out.println(name);
        User user = dao.findByName(name);
        if (user != null) {
            String p = user.getPassword();
            if (p.equals(password)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void register(User user) {
        dao.insertSelective(user);
    }
}
