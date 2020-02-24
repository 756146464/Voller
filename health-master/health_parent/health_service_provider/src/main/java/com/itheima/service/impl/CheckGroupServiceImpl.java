package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.dao.CheckGroupDao;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.CheckGroup;
import com.itheima.service.CheckGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = CheckGroupService.class)
@Transactional
public class CheckGroupServiceImpl implements CheckGroupService {
    @Autowired
    private CheckGroupDao checkGroupDao;

    @Override
    public void add(CheckGroup checkGroup, Integer[] checkitemIds) {
        checkGroupDao.add(checkGroup);
        Integer checkGroupId = checkGroup.getId();
        setCheckGroupAndCheckItem(checkGroupId, checkitemIds);
    }

    public void setCheckGroupAndCheckItem(Integer groutId, Integer[] checkitemIds) {
        if (checkitemIds!=null&&checkitemIds.length>0) {
            for (Integer checkitemId : checkitemIds) {
                Map map = new HashMap<>();
                map.put("checkgroupId", groutId);
                map.put("checkitemId", checkitemId);
                checkGroupDao.setCheckGroupAndCheckItem(map);
            }
        }
    }

    @Override
    public PageResult findPage(QueryPageBean queryPageBean) {
        Integer currentPage = queryPageBean.getCurrentPage();
        Integer pageSize = queryPageBean.getPageSize();
        String queryString = queryPageBean.getQueryString();
        PageHelper.startPage(currentPage, pageSize);
        Page all = checkGroupDao.selectByCondition(queryString);
        List result = all.getResult();
        long total = all.getTotal();
        return new PageResult(total, result);
    }

    @Override
    public List<CheckGroup> findAll() {
        return checkGroupDao.findAll();
    }

    @Override
    public CheckGroup findById(Integer checkgroupId) {
        return checkGroupDao.findById(checkgroupId);
    }

    @Override
    public List<Integer> findCheckitemIdsByCheckgroupId(Integer checkgroupId) {
        return checkGroupDao.findCheckItemIdsByCheckGroupId(checkgroupId);
    }

    @Override
    public void edit(CheckGroup checkGroup, Integer[] checkitemIds) {
        checkGroupDao.edit(checkGroup);
        checkGroupDao.deleteAssocication(checkGroup.getId());
        setCheckGroupAndCheckItem(checkGroup.getId(), checkitemIds);
    }

    @Override
    public void delete(Integer id) {
        //判断是否绑定套餐
        Integer count = checkGroupDao.findCountBySetmeal(id);
        if (count>0){
            new RuntimeException();
        }
        //删除检查组关联的检查项
        checkGroupDao.deleteAssocication(id);
        //最后删除检查组
        checkGroupDao.delete(id);
    }
}
