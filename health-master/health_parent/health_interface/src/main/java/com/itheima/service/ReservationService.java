package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.Reservation;
import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

public interface ReservationService {
    //查询所有预约信息
    List<Reservation> findAll();

    //分页管理
    PageResult findPage(QueryPageBean queryPageBean);

    //编辑预约信息
   void edit(Reservation reservation);

   //根据id查询预约信息
   Reservation findById(Integer id);

   //添加预约信息
   void add(Reservation reservation);

   //删除预约信息
   void delete(Integer id);

   //根据预约信息id查询套餐ids
   List<Integer> findSetmealIdsByReservationId(Integer id);
}
