package com.icss.hotel.controller;

import com.icss.hotel.domain.Daily;
import com.icss.hotel.domain.Group;
import com.icss.hotel.domain.User;
import com.icss.hotel.service.DailyService;
import com.icss.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/daily")
public class DailyController extends BaseController {
    @Autowired
    private DailyService dailyService;
    @ResponseBody
    @RequestMapping("/addDaily.action")
    public Map<String,Object>addDaily(Daily daily) {
        resultMap.clear();
        int i = dailyService.addDaily(daily);
        if(i!=-1){
            resultMap.put("code",200);
            resultMap.put("msg","录入成功");
        }
        else {
            resultMap.put("code",201);
            resultMap.put("msg","录入失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/getSpecificDaily.action")
    public Map<String,Object>getSpecificDaily(Daily daily) {
        resultMap.clear();
      /*  System.out.println(daily.getGroup_id());
        System.out.println(daily.getTime());*/
        List<Daily> daily1 = dailyService.getSpecificDaily(daily);
       /* System.out.println(daily1.size());
        for(Daily day:daily1){
            System.out.println(day.getName());
        }*/
        if(daily1.size()>0){
            resultMap.put("code",200);
            resultMap.put("msg","查询成功");
            resultMap.put("dailyList",daily1);
        }
        else {
            resultMap.put("code",201);
            resultMap.put("msg","未查询到当日信息");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/getAllDaily.action")
    public Map<String,Object>getAllDaily() {
        List<Daily> allDaily = dailyService.getAllDaily();
        resultMap.put("code",200);
        resultMap.put("allDailyList",allDaily);
        return resultMap;
    }
}
