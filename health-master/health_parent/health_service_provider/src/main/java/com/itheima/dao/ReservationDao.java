package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Reservation;

import java.util.List;

public interface ReservationDao {
    //查询所有预约管理集合
    List<Reservation> findAll();

    //分页查询方法
    Page findPage(String queryString);

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
