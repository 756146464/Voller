package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.constant.MessageConstant;
import com.itheima.entity.Result;
import com.itheima.pojo.OrderSetting;
import com.itheima.service.OrderSettingService;
import com.itheima.utils.POIUtils;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ordersetting")
public class OrderSettingController {

    @Reference
    private OrderSettingService orderSettingService;


    @RequestMapping("/upload")
    public Result upload(@RequestParam("excelFile") MultipartFile file) {
        try {
            List<String[]> list = POIUtils.readExcel(file);
            if (list != null && list.size() > 0) {
                ArrayList<OrderSetting> orderSettings = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    String[] strings = list.get(i);
                    OrderSetting orderSetting = new OrderSetting(new Date(strings[0]), Integer.valueOf(strings[1]));
                    orderSettings.add(orderSetting);
                }
                orderSettingService.add(orderSettings);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.IMPORT_ORDERSETTING_FAIL);
        }

        return new Result(true, MessageConstant.IMPORT_ORDERSETTING_SUCCESS);
    }

    @RequestMapping("/getOrderSettingByMonth")
    public Result getOrderSettingByMonth(String date) {
        try {
            List<Map> orderSettingByMonth = orderSettingService.getOrderSettingByMonth(date);
            return new Result(true, MessageConstant.GET_ORDERSETTING_SUCCESS, orderSettingByMonth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false, MessageConstant.GET_ORDERSETTING_FAIL);
    }

    @RequestMapping("/editOrderSettingByDate")
    public Result editOrderSettingByDate(@RequestBody  OrderSetting orderSetting) {
        try {
            orderSettingService.editOrderSettingByDate(orderSetting);
            return new Result(true, MessageConstant.ORDERSETTING_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.ORDERSETTING_FAIL);
        }
    }
}
