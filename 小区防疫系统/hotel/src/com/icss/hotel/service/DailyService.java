package com.icss.hotel.service;

import com.icss.hotel.domain.Daily;

import java.util.List;

public interface DailyService {
    int addDaily(Daily daily);

    List<Daily> getSpecificDaily(Daily daily);

    List<Daily>getAllDaily();
}
