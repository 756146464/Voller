package com.itheima.dao;

import com.itheima.pojo.OrderSetting;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface OrderSettingDao {

    long findCountByOrderDate(Date date);

    void editNumberByOrderDate(OrderSetting orderSetting);

    void add(OrderSetting orderSetting);

    List<OrderSetting> getOrderSettingByMonth(Map map);

    public OrderSetting findByOrderDate(Date orderDate);
    public void editReservationsByOrderDate(OrderSetting orderSetting);

}
