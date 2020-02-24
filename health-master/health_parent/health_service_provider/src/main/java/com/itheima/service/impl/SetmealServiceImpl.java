package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.constant.RedisConstant;
import com.itheima.dao.SetmealDao;
import com.itheima.entity.PageResult;
import com.itheima.pojo.Setmeal;
import com.itheima.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = SetmealService.class)
@Transactional
public class SetmealServiceImpl implements SetmealService {

    @Autowired
    private SetmealDao setmealDao;

    @Autowired
    private JedisPool jedisPool;

    @Override
    public void add(Setmeal setmeal, Integer[] checkGroupIds) {
        setmealDao.add(setmeal);

        if (checkGroupIds != null && checkGroupIds.length > 0) {
            setSetmealAndCheckgroup(setmeal, checkGroupIds);
        }
        savePic2Redis(setmeal.getImg());
    }

    @Override
    public PageResult pageQuery(String queryString, Integer pageSize, Integer currentPage) {
        PageHelper.startPage(currentPage, pageSize);
        Page<Setmeal> setmeals = setmealDao.findByCondition(queryString);
        return  new PageResult(setmeals.getTotal(), setmeals.getResult());
    }

    @Override
    public Setmeal findById(int id) {
        return setmealDao.findById(id);
    }

    @Override
    public List<Setmeal> findAll() {
        return setmealDao.findAll();
    }

    private void setSetmealAndCheckgroup(Setmeal setmeal, Integer[] checkGroupIds) {
        for (Integer checkGroupId : checkGroupIds) {
            Map map = new HashMap<>();
            map.put("setmealId",  setmeal.getId());
            map.put("checkgroupId", checkGroupId);
            setmealDao.setSetmealAndCheckGroup(map);
        }
    }

    private void savePic2Redis(String fileName) {
        jedisPool.getResource().sadd(RedisConstant.SETMEAL_PIC_DB_RESOURCES, fileName);
    }

    //查询套餐预约占比
    public List<Map<String, Object>> findSetmealCount() {
        return setmealDao.findSetmealCount();
    }
    @Override
    public List<Integer> setcheckgroupidBysetmealid(Integer id) {
        return setmealDao.setcheckgroupidBysetmealid(id);
    }

    /**
     * 编辑提交套餐
     * @param setmeal 套餐内容
     * @param checkgroupid 套餐绑定的检查组ID
     */
    public void edit(Setmeal setmeal, Integer[] checkgroupid) {
        setmealDao.editSetmeal(setmeal);
        setmealDao.deleteCheckGroupAdnSetmeal(setmeal.getId());
        //删除关联检查组数据
        if (checkgroupid!=null && checkgroupid.length>0){
            for (Integer integer : checkgroupid) {
                Map<String,Integer> map = new HashMap<>();
                map.put("setmealid",setmeal.getId());
                map.put("checkgroupid",integer);
                setmealDao.setSetmealAndCheckGroup(map);
            }
        }
    }
    @Override
    public void delete(Integer id) {
        System.out.println(id+"...");
        if (id!=null) {
            setmealDao.deleteCheckGroupAdnSetmeal(id);
            setmealDao.delete(id);
        }
    }
}
