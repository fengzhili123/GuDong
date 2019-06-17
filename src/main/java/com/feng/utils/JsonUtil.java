package com.feng.utils;


import com.feng.common.JsonBean;

public class JsonUtil {
    public static JsonBean writeJsonBean(int code, Object info) {
        JsonBean bean = new JsonBean();
        try {
            bean.setCode(code);
            bean.setInfo(info);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return bean;
    }
}
