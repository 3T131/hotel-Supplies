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

    public int delete(String[] pId) {
        return passengerDao.delete(pId);
    }

    public Passenger queryPassengerId(int pId) {
        return passengerDao.queryPassengerId(pId);
    }

    public Integer update(Passenger passenger) {
        return passengerDao.update(passenger);
    }

    public int add(Passenger passenger) {
        return passengerDao.add(passenger);
    }


}
