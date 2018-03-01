package com.accp.biz.impl;

import com.accp.biz.PassengerBiz;
import com.accp.dao.PassengerDao;
import com.accp.entity.Passenger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PassengerBizImpl implements PassengerBiz {
    @Resource
    private PassengerDao passengerDao;

    public List<Passenger> list(String name) {
        return passengerDao.list(name);
    }

    public int delete(String[] passengerId) {
        return passengerDao.delete(passengerId);
    }

    public Passenger queryPassengerId(int passengerId) {
        return passengerDao.queryPassengerId(passengerId);
    }


}
