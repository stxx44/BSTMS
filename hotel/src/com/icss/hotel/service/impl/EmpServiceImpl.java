package com.icss.hotel.service.impl;

import com.icss.hotel.dao.EmpMapper;
import com.icss.hotel.domain.Emp;
import com.icss.hotel.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp logon(String account) {
        return empMapper.logon(account);
    }

    @Override
    public int addEmp(Emp emp) {
        return empMapper.addEmp(emp);
    }

    @Override
    public List<Emp> queryAllEmp() {
        return empMapper.queryAllEmp();
    }

    @Override
    public int quit(Integer tno) {
        return empMapper.quit(tno);
    }

    @Override
    public int back(Integer tno) {
        return empMapper.back(tno);
    }

    @Override
    public int resetPsw(Integer tno){return empMapper.resetPsw(tno);}

    @Override
    public int updateEmp(Emp emp){ return empMapper.updateEmp(emp);}

    @Override
    public Emp queryEmpById(Integer empno){return empMapper.queryEmpById(empno);}
}
