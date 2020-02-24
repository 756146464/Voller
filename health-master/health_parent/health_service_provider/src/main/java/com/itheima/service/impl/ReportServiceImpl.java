package com.itheima.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dao.MemberDao;
import com.itheima.dao.OrderDao;
import com.itheima.service.ReportService;
import com.itheima.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = ReportService.class)
@Transactional
public class ReportServiceImpl implements ReportService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private OrderDao orderdao;

    @Override
    public Map<String, Object> getBusinessReportData() throws Exception {
        //获取本周一日期
        String ThisWeekMonday = DateUtils.parseDate2String(DateUtils.getThisWeekMonday());
        //获取本月第一天日期
        String FirstDay4ThisMonth = DateUtils.parseDate2String(DateUtils.getFirstDay4ThisMonth());
        //报表日期
        String today =  DateUtils.parseDate2String(DateUtils.getToday());
        //本日新增会员数
        Integer todayNewMember = memberDao.findMemberCountByDate(today);
        //总会员数
        Integer totalMember = memberDao.findMemberTotalCount();
        //本周会员数
        Integer thisWeekNewMember = memberDao.findMemberCountAfterDate(ThisWeekMonday);
        //本月新增会员数
        Integer thisMonthNewMember = memberDao.findMemberCountAfterDate(FirstDay4ThisMonth);
        //今日预约数
        Integer todayOrderNumber = orderdao.findOrderCountByDate(today);
        //本周预约数
        Integer thisWeekOrderNumber = orderdao.findOrderCountAfterDate(ThisWeekMonday);
        //本月预约数
        Integer thisMonthOrderNumber = orderdao.findOrderCountAfterDate(FirstDay4ThisMonth);
        //今日到诊数
        Integer todayVisitsNumber = orderdao.findVisitsCountByDate(today);
        //本周到诊数
        Integer thisWeekVisitsNumber = orderdao.findVisitsCountAfterDate(ThisWeekMonday);
        //本月到诊数
        Integer thisMonthVisitsNumber = orderdao.findVisitsCountAfterDate(FirstDay4ThisMonth);
        //热门套餐查询
        List<Map> hotSetmeal = orderdao.findHotSetmeal();
        Map<String,Object>result = new HashMap<>();
        result.put("reportDate",today);
        result.put("todayNewMember",todayNewMember);
        result.put("totalMember",totalMember);
        result.put("thisWeekNewMember",thisWeekNewMember);
        result.put("thisMonthNewMember",thisMonthNewMember);
        result.put("todayOrderNumber",todayOrderNumber);
        result.put("thisWeekOrderNumber",thisWeekOrderNumber);
        result.put("thisMonthOrderNumber",thisMonthOrderNumber);
        result.put("todayVisitsNumber",todayVisitsNumber);
        result.put("thisWeekVisitsNumber",thisWeekVisitsNumber);
        result.put("thisMonthVisitsNumber",thisMonthVisitsNumber);
        result.put("hotSetmeal",hotSetmeal);

        return result;
    }

}
