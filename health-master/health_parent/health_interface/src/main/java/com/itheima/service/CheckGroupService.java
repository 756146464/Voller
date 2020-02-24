package com.itheima.service;


import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.CheckGroup;

import java.util.List;

public interface CheckGroupService {
    public void add(CheckGroup checkGroup, Integer[] checkitemIds);

    public PageResult findPage(QueryPageBean queryPageBean);

    public List<CheckGroup> findAll();

    public CheckGroup findById(Integer checkgroupId);

    List<Integer> findCheckitemIdsByCheckgroupId(Integer checkgroupId);

    void edit(CheckGroup checkGroup, Integer[] checkitemIds);

    void delete(Integer id);
}
