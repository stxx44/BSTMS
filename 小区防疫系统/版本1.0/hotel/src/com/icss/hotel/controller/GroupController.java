package com.icss.hotel.controller;

import com.icss.hotel.domain.Group;
import com.icss.hotel.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/group")
public class GroupController extends BaseController {
    @Autowired
    private GroupService groupService;
    @ResponseBody
    @RequestMapping("/addGroup.action")
    public Map<String, Object> addGroup(Group group) {
        resultMap.clear();
        int result = groupService.addGroup(group);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "创建成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "创建失败");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/queryAllGroup.action")
    public Map<String, Object> queryAllGroup() {
        resultMap.clear();
        List<Group> list = groupService.queryAllGroup();
        if (list.isEmpty()) {
            resultMap.put("code", 201);
            resultMap.put("msg", "没有客房相关数据");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("groups", list);
        }
        return resultMap;
    }

}
