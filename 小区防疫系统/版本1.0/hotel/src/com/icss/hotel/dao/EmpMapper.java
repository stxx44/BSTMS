package com.icss.hotel.dao;

import com.icss.hotel.domain.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * 登录方法
     *
     * @param account 用户输入的账号
     * @return
     */
    Emp logon(String account);

    /**
     * 新员工入职
     *
     * @param emp
     * @return
     */
    int addEmp(Emp emp);

    /**
     * 显示所有员工
     *
     * @return
     */
    List<Emp> queryAllEmp();

    /**
     * 离职
     *
     * @param empno
     * @return
     */
    int quit(Integer empno);

    int back(Integer empno);


    int updateEmp(Emp emp);

    Emp queryEmpById(Integer empno);

    int resetPsw(Integer empno);
}