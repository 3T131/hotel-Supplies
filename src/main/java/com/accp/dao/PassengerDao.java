package com.accp.dao;

import com.accp.entity.Passenger;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PassengerDao {
    /*
    * 查询所有的旅客&&条件查询
    * */
    List<Passenger> list(@Param("name") String name);

    /*
    * 新增旅客
    * */
    int add(Passenger passenger);

    /*
    * 删除旅客
    * */
    int delete(String[] passengerId);
    /*
    * 查询要修改的旅客
    * */
    Passenger queryPassengerId(@Param("passengerId")int passengerId);
}
