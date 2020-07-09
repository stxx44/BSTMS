package com.icss.hotel.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {
    protected Map<String, Object> resultMap = new HashMap<>();


    protected Map<String, Object> executeDML(int result, String msg) {
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", msg + "成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", msg + "失败");
        }
        return resultMap;
    }
}
