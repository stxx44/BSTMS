package com.icss.hotel.controller;

import com.icss.hotel.domain.Customer;
import com.icss.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController{

    @Autowired
    CustomerService customerService;

    @ResponseBody
    @RequestMapping("/getAllCustomer.action")

    public Map<String, Object> getAllCustomer() {
        resultMap.clear();
        List<Customer> list = customerService.getAllCustomer();
        if (list.isEmpty()) {
            resultMap.put("code", 201);
            resultMap.put("msg", "没有顾客相关数据");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("CustomerList", list);
        }
        return resultMap;
    }


    @ResponseBody
    @RequestMapping("/queryAllCustomer.action")
    public Map<String,Object> queryAllCustomer() {
        resultMap.clear();
        List<Customer> list = customerService.queryAllCustomer();
        if (list.isEmpty()){
            resultMap.put("code", 201);
            resultMap.put("msg", "没有顾客数据");
        } else {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("CustomerList", list);
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/addCustomer.action")
    public Map<String,Object> addCustomer(Customer customer){
        resultMap.clear();
        int L = customer.getPhone().length();
        int L_idcard = customer.getIdcard().length();
        if(L_idcard!=18)
        {
            resultMap.put("code", 201);
            resultMap.put("msg", "请输入正确的身份证");
        }
        else if(L != 11)
        {
            resultMap.put("code", 201);
            resultMap.put("msg", "请输入正确的手机号");
        }
        else
        {
            System.out.println(L);
            int result = customerService.addCustomer(customer);
            System.out.println(result);
            if (result != -1) {
                resultMap.put("code", 200);
                resultMap.put("msg", "添加员工成功");
            } else {
                resultMap.put("code", 201);
                resultMap.put("msg", "添加员工失败");
            }
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/queryCMByCno.action")
    public Map<String, Object> queryCMByCno(Integer cno) {
        resultMap.clear();
        Customer customer = customerService.queryCMByCno(cno);
        resultMap.put("code", 200);
        resultMap.put("msg", "查询成功");
        resultMap.put("cm",customer);
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateCM.action")
    public Map<String, Object> updateCM(Customer customer) {
        resultMap.clear();
        int L_idcard = customer.getIdcard().length();
        int L_phone = customer.getPhone().length();
        if(L_idcard !=18 )
        {
            resultMap.put("code", 201);
            resultMap.put("msg", "请输入正确的身份证号");
        }
        else if(L_phone != 11)
        {
            resultMap.put("code", 201);
            resultMap.put("msg", "请输入正确的手机号");
        }
        else {
            int result = customerService.updateCM(customer);
            if (result != -1) {
                resultMap.put("code", 200);
                resultMap.put("msg", "更新顾客信息成功");
            } else {
                resultMap.put("code", 201);
                resultMap.put("msg", "更新顾客信息失败");
            }
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/q.action")
    public Map<String,Object> queryCustomerByName(String cname){
        resultMap.clear();

        Customer cm = customerService.queryCustomerByName(cname);
        resultMap.put("code", 200);
        resultMap.put("msg", "查询成功");
        resultMap.put("cm",cm);
        return resultMap;
    }
}
