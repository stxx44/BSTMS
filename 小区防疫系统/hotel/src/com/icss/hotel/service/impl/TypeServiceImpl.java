package com.icss.hotel.service.impl;

import com.icss.hotel.dao.TypeMapper;
import com.icss.hotel.domain.Type;
import com.icss.hotel.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public int addType(Type type) {
        return typeMapper.addType(type);
    }

    @Override
    public List<Type> queryAllType() {
        return typeMapper.queryAllType();
    }

    @Override
    public int delType(Integer tno) {
        return typeMapper.delType(tno);
    }

    @Override
    public Type queryTypeById(Integer tno) {
        return typeMapper.queryTypeById(tno);
    }

    @Override
    public int updateType(Type type) {
        return typeMapper.updateType(type);
    }

    @Override
    public int updateRestNum(Type type){return typeMapper.updateRestNum(type);}

    @Override
    public int updateRestNumn(String tname){return typeMapper.updateRestNumn(tname);}
}
