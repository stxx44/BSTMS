package com.icss.hotel.controller;

import com.icss.hotel.dao.GroupMapper;
import com.icss.hotel.domain.Group;
import com.icss.hotel.domain.GroupList;
import com.icss.hotel.service.GroupService;
import com.icss.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/group")
public class GroupController extends BaseController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/addGroupList.action")
    public Map<String, Object> addGroupList(GroupList groupList) {
        resultMap.clear();
        int result = groupService.addGroupList(groupList);
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
    @RequestMapping("/addGroup.action")
    public Map<String, Object> addGroup(Group group) {
        resultMap.clear();
        int result = groupService.addGroup(group);
        int result2 =userService.updateGroupId(group);
        if (result != -1 && result2 !=-1) {
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
            resultMap.put("msg", "没有相关组团数据");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("groups", list);
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/queryGroupId.action")
    public Map<String, Object> queryGroupId(String group_id) {
        resultMap.clear();
        Group group = groupService.queryGroupId(group_id);
        if (group == null) {
            resultMap.put("code", 201);
            resultMap.put("msg", "邀请码错误");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "已存在组团");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/joinGroup.action")
    public Map<String, Object>join_group(GroupList groupList){
        resultMap.clear();
        Group group = groupService.findGroup(groupList.getGroup_id());
        int result;
                if(group == null){
                    resultMap.put("code",201);
                    resultMap.put("msg","未找到组团码");
                }
                else{
                    result = groupService.joinGroup(groupList);
                    if(result !=-1){
                        resultMap.put("code",200);
                        resultMap.put("msg","加入组团成功");
                    }
                    else {
                        resultMap.put("code",201);
                        resultMap.put("msg","加入组团失败");
                    }
                }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/checkLevel.action")
    public Map<String, Object>checkLevel(String account){
        resultMap.clear();
        int result = groupService.checkLevel(account);
        if(result != 3){
            resultMap.put("code",201);
            resultMap.put("msg","你的权限不足");
        }
        else {
            resultMap.put("code",200);
            resultMap.put("msg","权限验证通过");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/deleteGroup.action")
    public Map<String,Object> deleteGroup(Group group){
        int i = groupService.deleteGroup(group);
        int j = userService.deleteGroup(group.getGroup_id());
        if(i!=-1){
            resultMap.put("code",200);
            resultMap.put("msg","删除成功");
        }
        else {
            resultMap.put("code",201);
            resultMap.put("msg","删除失败");
        }
        return resultMap;
    }
}
