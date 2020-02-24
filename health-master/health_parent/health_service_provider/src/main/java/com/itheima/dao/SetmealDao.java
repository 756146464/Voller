package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Setmeal;

import java.util.List;
import java.util.Map;

public interface SetmealDao {
    public void add(Setmeal setmeal);

    public void setSetmealAndCheckGroup(Map map);

    public Page<Setmeal> findByCondition(String queryString);

    List<Setmeal> findAll();

    Setmeal findById(int id);

    List<Map<String, Object>> findSetmealCount();

    List<Integer> setcheckgroupidBysetmealid(Integer id);

    void deleteCheckGroupAdnSetmeal(Integer integer);

    void editSetmeal(Setmeal setmeal);

    void delete(Integer id);
}