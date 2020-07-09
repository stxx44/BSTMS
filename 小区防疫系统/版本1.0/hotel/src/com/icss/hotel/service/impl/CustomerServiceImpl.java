package com.icss.hotel.service.impl;

import com.icss.hotel.dao.CustomerMapper;
import com.icss.hotel.domain.Customer;
import com.icss.hotel.service.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> queryAllCustomer() {
        return customerMapper.queryAllCustomer();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerMapper.getAllCustomer();
    }

    @Override
    public int addCustomer(Customer customer) {return customerMapper.addCustomer(customer);}

    @Override
    public Customer queryCustomerByName(String cname) {
        return customerMapper.queryCustomerByName(cname);
    }


    @Override
    public int updateIntegral(@Param("cno") int cno, @Param("integral") int integral){return customerMapper.updateIntegral(cno,integral);}

    @Override
    public int updateCM(Customer customer) { return customerMapper.updateCM(customer); }

    @Override
    public Customer queryCMByCno(Integer cno) { return customerMapper.queryCMByCno(cno); }
}
