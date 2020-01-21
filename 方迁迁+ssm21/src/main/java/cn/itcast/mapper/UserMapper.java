package cn.itcast.mapper;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: Summer
 * @Time: 2020/1/19 11:43
 */
public interface UserMapper {

    @Select("select * from user where username=#{username} and password=#{password}")
    User findUser(User user);

}
