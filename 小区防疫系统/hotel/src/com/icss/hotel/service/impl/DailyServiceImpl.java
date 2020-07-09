package com.icss.hotel.service.impl;

import com.icss.hotel.dao.DailyMapper;
import com.icss.hotel.domain.Daily;
import com.icss.hotel.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyServiceImpl implements DailyService {
    @Autowired
    DailyMapper dailyMapper;
    @Override
    public int addDaily(Daily daily) {
        return dailyMapper.addDaily(daily);
    }

    @Override
    public List<Daily> getSpecificDaily(Daily daily) {
        return dailyMapper.getSpecificDaily(daily);
    }

    @Override
    public List<Daily> getAllDaily() {
        return dailyMapper.getAllDaily();
    }

}
