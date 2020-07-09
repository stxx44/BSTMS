package com.icss.hotel.dao;

import org.apache.ibatis.annotations.Param;
import com.icss.hotel.domain.Daily;

import java.util.List;

public interface DailyMapper {
    int addDaily(Daily daily);

    List<Daily>getSpecificDaily(Daily daily);

    List<Daily>getAllDaily();
}
