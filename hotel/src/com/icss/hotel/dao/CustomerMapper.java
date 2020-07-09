package com.icss.hotel.dao;

import com.icss.hotel.domain.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cno);


    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer cno);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> getAllCustomer();

    List<Customer> queryAllCustomer();

    int addCustomer(Customer customer);

    Customer queryCustomerByName(String cname);

    int updateIntegral(@Param("cno")int cno, @Param("integral") int integral);

    int updateCM(Customer customer);

    Customer queryCMByCno(Integer cno);
}