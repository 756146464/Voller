package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.constant.MessageConstant;
import com.itheima.constant.RedisConstant;
import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.entity.Result;
import com.itheima.pojo.Setmeal;
import com.itheima.service.SetmealService;
import com.itheima.utils.QiniuUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import redis.clients.jedis.JedisPool;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/setmeal")
public class SetmealController {

    @Reference
    private SetmealService setmealService;

    //新增套餐方法
    @RequestMapping("/add")
    public Result add(@RequestBody Setmeal setmeal, Integer[] checkgroupIds) {
        try {
            setmealService.add(setmeal, checkgroupIds);
            return new Result(true, MessageConstant.ADD_SETMEAL_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.ADD_SETMEAL_FAIL);
        }
    }

    @Autowired
    private JedisPool jedisPool;

    //上传方法
    @RequestMapping("/upload")
    public Result upload(@RequestParam("imgFile") MultipartFile multipartFile) {
        try {
            String originalFilename = multipartFile.getOriginalFilename();//获取原始文件名  新建套餐.png
            int lastIndexOf = originalFilename.lastIndexOf("."); //获取后缀

            String suffix = originalFilename.substring(lastIndexOf - 1);
            String fileName = UUID.randomUUID().toString() + suffix;
            QiniuUtils.upload2Qiniu(multipartFile.getBytes(), fileName);
            jedisPool.getResource().sadd(RedisConstant.SETMEAL_PIC_RESOURCES, fileName);
            return new Result(true, MessageConstant.PIC_UPLOAD_SUCCESS, fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.PIC_UPLOAD_FAIL);
        }
    }

    //分页查询方法
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean) {
        return setmealService.pageQuery(queryPageBean.getQueryString(), queryPageBean.getPageSize(), queryPageBean.getCurrentPage());
    }
    /**
     * 回显套餐信息
     * @param id 套餐ID
     * @return
     */
    //根据id查询套餐方法
    @RequestMapping("/findById")
    public Result findById(Integer id){
        try {
            Setmeal byId = setmealService.findById(id);
            return new Result(true, MessageConstant.QUERY_SETMEAL_SUCCESS,byId);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.QUERY_SETMEAL_FAIL);
        }
    }
    //通过套餐id设置检查组id方法
    @RequestMapping("/setcheckgroupidBysetmealid")
    public Result setcheckgroupidBysetmealid(Integer id){
        try {
            List<Integer> checkgroupid = setmealService.setcheckgroupidBysetmealid(id);
            return new Result(true, MessageConstant.QUERY_CHECKGROUP_SUCCESS,checkgroupid);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.QUERY_CHECKGROUP_FAIL);
        }
    }

    //编辑方法
    @RequestMapping("/edit")
    public Result edit(@RequestBody Setmeal setmeal,Integer[] checkgroupIds){
        try {
            System.out.println(checkgroupIds.length);
            setmealService.edit(setmeal,checkgroupIds);
            return new Result(true, MessageConstant.QUERY_CHECKGROUP_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.QUERY_CHECKGROUP_FAIL);
        }
    }

    //删除方法
    @RequestMapping("/delete")
    public Result delete(Integer id){
        try {
            System.out.println(id);
            setmealService.delete(id);
            return new Result(true, MessageConstant.DELETE_SETMEAL_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.DELETE_SETMEAL_FAIL);
        }
    }

    //查询所有套餐方法
    @RequestMapping("/findAll")
    public Result findAll(){
        List<Setmeal> setmealList = setmealService.findAll();
        //判断这个集合长度大于0且不为空
        if (setmealList != null && setmealList.size() != 0) {
            return new Result(true, MessageConstant.QUERY_SETMEALLIST_SUCCESS, setmealList);
        }
        return new Result(false, MessageConstant.QUERY_SETMEALLIST_FAIL);
    }
}
