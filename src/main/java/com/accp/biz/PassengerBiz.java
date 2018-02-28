package com.accp.biz;

import com.accp.entity.Passenger;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PassengerBiz {
    /*
    * 查询所有的旅客
    * */
    List<Passenger> list(String name);

    /*
       * 删除旅客
       * */
    int delete(String[] passengerId);

    /*
    * 查询要修改的旅客
    * */
    Passenger queryPassengerId(@Param("passengerId") int passengerId);
}
