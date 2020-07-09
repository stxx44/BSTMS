package com.icss.hotel.controller;

import com.icss.hotel.domain.Emp;
import com.icss.hotel.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class EmpController extends BaseController {

    @Autowired
    private EmpService empService;

    @ResponseBody
    @RequestMapping("/logon.action")
    public Map<String, Object> logon(String account, String password) {
        resultMap.clear();
        Emp emp = empService.logon(account);
        if (emp == null) {
            resultMap.put("code", 202);
            resultMap.put("msg", "账号不存在");
        } else if (!emp.getPassword().equals(password)) {
            resultMap.put("code", 201);
            resultMap.put("msg", "密码错误");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "登录成功");
            resultMap.put("result", emp);
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/queryAllEmp.action")
    public Map<String, Object> queryAllEmp() {
        resultMap.clear();
        List<Emp> list = empService.queryAllEmp();
        if (list.isEmpty()) {
            resultMap.put("code", 201);
            resultMap.put("msg", "没有员工数据");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("empList", list);
        }
        return resultMap;
    }


    @ResponseBody
    @RequestMapping("/addEmp.action")
    public Map<String, Object> addEmp(Emp emp) {
        resultMap.clear();
        int result = empService.addEmp(emp);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "添加员工成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "添加员工失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/quit.action")
    public Map<String, Object> quit(Integer empno) {
        int result = empService.quit(empno);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "办理离职成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "办理离职失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/back.action")
    public Map<String, Object> back(Integer empno) {
        int result = empService.back(empno);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "办理复职成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "办理复职失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateEmp.action")
    public Map<String, Object> updateEmp(Emp emp) {
        resultMap.clear();
        int result = empService.updateEmp(emp);
        if(result != -1){
            resultMap.put("code", 200);
            resultMap.put("msg", "更新员工信息成功");
        }else {
            resultMap.put("code", 201);
            resultMap.put("msg", "更新员工信息失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/resetPsw.action")
    public Map<String, Object> resetPsw(Integer empno) {
        resultMap.clear();
        int result = empService.resetPsw(empno);
        if(result != -1){
            resultMap.put("code", 200);
            resultMap.put("msg", "重置密码成功");
        }else {
            resultMap.put("code", 201);
            resultMap.put("msg", "重置密码失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/queryEmpById.action")
    public Map<String, Object> queryEmpById(Integer empno) {
        resultMap.clear();
        Emp emp = empService.queryEmpById(empno);
        resultMap.put("code", 200);
        resultMap.put("msg", "查询成功");
        resultMap.put("emp", emp);
        return resultMap;
    }
}
