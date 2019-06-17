package com.feng.service;

import com.feng.pojo.User;

public interface UserService {
    public User login(String name, String password);

    public void register(User user);
}
