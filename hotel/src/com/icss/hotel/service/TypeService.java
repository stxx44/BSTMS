package com.icss.hotel.service;

import com.icss.hotel.domain.Type;

import java.util.List;

public interface TypeService {
    /**
     * 添加客房类型
     *
     * @param type
     * @return
     */
    int addType(Type type);

    /**
     * 查询所有的房间类型
     *
     * @return
     */
    List<Type> queryAllType();

    /**
     * 刪除客房类型
     *
     * @param tno
     * @return
     */
    int delType(Integer tno);

    /**
     * 根据编号查询客房类型
     *
     * @param tno
     * @return
     */
    Type queryTypeById(Integer tno);

    /**
     * 更新客房类型信息
     *
     * @param type
     * @return
     */
    int updateType(Type type);

    int updateRestNum(Type type);

    int updateRestNumn(String tname);
}
