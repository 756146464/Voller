package cn.itcast.Service;

import cn.itcast.domain.User;

import java.util.List;

public interface UserService {

    void save(User user) throws Exception;

    List<User> findAll() throws Exception;

    List<User> findById(String is);
}
