package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.NewsMapper;
import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.News;
import com.qfedu.pojo.User;
import com.qfedu.service.NewsService;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper dao;


    @Override
    public Map<String, Object> findByPage(int page) {
        PageHelper.startPage(page, 5);
        List<News> list = dao.findAll();
        Map<String, Object> map = new HashMap<>();
        map.put("total", ((Page) list).getTotal());
        map.put("rows", list);
        return map;
    }
}
