package com.qfedu.service.impl;

import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper dao ;

    @Override
    public User login(String name,String password) {
        User user = dao.findByName(name);
        if (user != null){
            String p = user.getPassword();
            if (p.equals(password)){
                return user;
            }
        }
        return null;
    }
}
