package com.icss.hotel.service;

import com.icss.hotel.domain.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerService {

    List<Customer> queryAllCustomer();

    List<Customer> getAllCustomer();

    int addCustomer(Customer customer);


    Customer queryCustomerByName(String cname);

    int updateIntegral(@Param("cno") int cno, @Param("integral") int integral);

    int updateCM(Customer customer);

    Customer queryCMByCno(Integer cno);
}
