package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.dao.ReservationDao;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.Reservation;
import com.itheima.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(interfaceClass = ReservationService.class)
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationDao reservationDao;

    //查询所有预约信息
    @Override
    public List<Reservation> findAll() {
        return reservationDao.findAll();
    }

    //
    @Override
    public PageResult findPage(QueryPageBean queryPageBean) {
        //mybatis分页查询助手,传入当前页码,每页显示条数两个参数
        PageHelper.startPage(queryPageBean.getCurrentPage(), queryPageBean.getPageSize());
        String quertString = null;//定义查询条件为空
        if (queryPageBean.getQueryString() != null) {//如果查询条件不为空
            //把所有的空格替换掉
            quertString = queryPageBean.getQueryString().replaceAll(" ", "");
        }
        //调用分页查询方法,返回值是封装检查组的page对象
        Page<Reservation> ReservationList = reservationDao.findPage(quertString);
        //返回封装pageResult,,里面传入总条数和每页查询集合两个参数
        return new PageResult(ReservationList.getTotal(), ReservationList.getResult());
    }

    //编辑预约信息
    @Override
    public void edit(Reservation reservation) {
        reservationDao.edit(reservation);
    }

    //根据id查询预约信息
    @Override
    public Reservation findById(Integer id) {
        return reservationDao.findById(id);
    }

    //添加预约信息
    @Override
    public void add(Reservation reservation) {
        reservationDao.add(reservation);
    }

    //删除预约信息
    @Override
    public void delete(Integer id) {
        reservationDao.delete(id);
    }

    //根据预约信息id查询套餐ids
    @Override
    public List<Integer> findSetmealIdsByReservationId(Integer id) {
        return reservationDao.findSetmealIdsByReservationId(id);
    }
}
