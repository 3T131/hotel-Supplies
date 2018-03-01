package com.accp.biz;

import com.accp.entity.AttributeDetails;
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
    int delete(String[] pId);

    /*
    * 查询要修改的旅客
    * */
    Passenger queryPassengerId(@Param("pId") int pId);
    /**
     * 修改旅客
     * @param passenger
     * @return
     */
    Integer update(Passenger passenger);
    /**
     * 新增旅客
     * @param passenger
     * @return
     */
    int add(Passenger passenger);
}
