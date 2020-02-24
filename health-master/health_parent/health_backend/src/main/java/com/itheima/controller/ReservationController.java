package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.constant.MessageConstant;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.entity.Result;
import com.itheima.pojo.Reservation;
import com.itheima.service.ReservationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Reference//dubbo服务
    private ReservationService reservationService;

    //查询所有预约信息
    @RequestMapping("/findAll")
    public Result findAll() {
        List<Reservation> reservationList = reservationService.findAll();
        //判断这个集合长度大于0且不为空
        if (reservationList != null && reservationList.size() != 0) {
            return new Result(true, MessageConstant.GET_RESERVATION_LIST_SUCCESS, reservationList);
        }
        return new Result(false, MessageConstant.GET_RESERVATION_LIST_FALL);
    }

    //分页查询
    @RequestMapping("/findPage")//封装查询条件
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean) {
        return reservationService.findPage(queryPageBean);
    }

    //编辑
    @RequestMapping("/edit")
    public Result edit(@RequestBody Reservation reservation) {
        try {
            reservationService.edit(reservation);
            return new Result(true, MessageConstant.EDIT_CHECKITEM_SUCCESS);
        } catch (Exception e) {
            return new Result(false, MessageConstant.EDIT_CHECKITEM_FAIL);
        }
    }

    //根据id查询预约信息
    @RequestMapping("/findById")
    public Result findById(Integer id) {
        try {
            Reservation reservation = reservationService.findById(id);
            //查询预约信息成功
            return new Result(true, MessageConstant.QUERY_ORDER_SUCCESS, reservation);
        } catch (Exception e) {
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.QUERY_ORDER_FAIL);
        }
    }

    //新增
    @RequestMapping("/add")
    public Result add(@RequestBody Reservation reservation) {
        try {
            reservationService.add(reservation);
            //新增预约信息成功
            return new Result(true, MessageConstant.ADD_RESERVATION_SUCCESS);
        } catch (Exception e) {
            //新增预约信息失败
            return new Result(false, MessageConstant.ADD_RESERVATION_FALL);
        }
    }

    //删除预约信息
    @RequestMapping("/delete")
    public Result delete(Integer id) {
        try {
            reservationService.delete(id);
            //删除预约信息成功
            return new Result(true, MessageConstant.DELETE_RESERVATION_SUCCESS);
        } catch (Exception e) {
            //删除预约信息失败
            return new Result(false, MessageConstant.DELETE_RESERVATION_FAIL);
        }
    }

    //根据预约信息id查询套餐复选框ids
    @RequestMapping("/findSetmealIdsByReservationId")
    public Result findSetmealIdsByReservationId(Integer id) {
        try {
            List<Integer> SetmealIds = reservationService.findSetmealIdsByReservationId(id);
            //查询套餐成功
            return new Result(true, MessageConstant.QUERY_SETMEAL_SUCCESS, SetmealIds);
        } catch (Exception e) {
            e.printStackTrace();
            //查询套餐失败
            return new Result(false, MessageConstant.QUERY_SETMEAL_FAIL);
        }
    }

}
