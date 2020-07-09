package com.icss.hotel.service;

import com.icss.hotel.domain.Emp;

import java.util.List;

public interface EmpService {
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
     * @param tno
     * @return
     */
    int quit(Integer tno);

    int back(Integer tno);

    int updateEmp(Emp emp);

    int resetPsw(Integer tno);

    Emp queryEmpById(Integer empno);
}
