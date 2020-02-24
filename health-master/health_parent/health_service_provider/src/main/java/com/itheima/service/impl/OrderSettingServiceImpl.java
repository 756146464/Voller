package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dao.OrderSettingDao;
import com.itheima.pojo.OrderSetting;
import com.itheima.service.OrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = OrderSettingService.class)
@Transactional
public class OrderSettingServiceImpl implements OrderSettingService {

    @Autowired
    private OrderSettingDao orderSettingDao;

    @Override
    public void add(List<OrderSetting> orderSettings) {
        if (orderSettings == null || orderSettings.size() == 0) {
            return;
        }

        for (OrderSetting orderSetting : orderSettings) {
            long countByOrderDate = orderSettingDao.findCountByOrderDate(orderSetting.getOrderDate());
            if (countByOrderDate > 0) {
                orderSettingDao.editNumberByOrderDate(orderSetting);
            } else {
                orderSettingDao.add(orderSetting);
            }
        }
    }

    @Override
    public void editOrderSettingByDate(OrderSetting orderSetting) {
        long countByOrderDate = orderSettingDao.findCountByOrderDate(orderSetting.getOrderDate());
        if (countByOrderDate > 0) {
            orderSettingDao.editNumberByOrderDate(orderSetting);
        } else {
            orderSettingDao.add(orderSetting);
        }
    }

    @Override
    public List<Map> getOrderSettingByMonth(String date) {
        String dateBegin = date + "-1";
        String dateEnd = date + "-31";
        HashMap<Object, Object> map = new HashMap<>();
        map.put("begin", dateBegin);
        map.put("end", dateEnd);
        List<OrderSetting> orderSettingByMonth = orderSettingDao.getOrderSettingByMonth(map);

        List<Map> result = new ArrayList<>();
        for (OrderSetting orderSetting : orderSettingByMonth) {
            Map orderSettingMap = new HashMap<>();
            orderSettingMap.put("date", orderSetting.getOrderDate().getDate());//天数
            orderSettingMap.put("number", orderSetting.getNumber());//可预约的人数
            orderSettingMap.put("reservations", orderSetting.getReservations());//已预约的人数
            result.add(orderSettingMap);
        }

        return result;
    }
}
