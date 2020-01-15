package cn.itcast.Service.Impl;

import cn.itcast.Mapper.UserMapper;
import cn.itcast.Service.UserService;
import cn.itcast.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) throws Exception {
        userMapper.save(user);
    }

    @Override
    public List<User> findAll() throws Exception {
        List<User> list = userMapper.findAll();
        return list;
    }

    @Override
    public List<User> findById(String is) {
        return userMapper.findById(is);
    }
}
