package cn.itcast.service.impl;

import cn.itcast.domain.Book;
import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public List<Book> findAll(Integer pageNum, Integer pageSize) {
        //设置分页条件：当前页码，每页显示条数
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.findAll(pageNum, pageSize);
    }
}
