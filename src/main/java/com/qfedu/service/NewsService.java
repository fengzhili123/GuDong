package com.qfedu.service;

import com.qfedu.pojo.News;
import com.qfedu.pojo.User;

import java.util.List;
import java.util.Map;

public interface NewsService {
    public Map<String, Object> findByPage(int page);
}

