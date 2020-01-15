package cn.itcast.Mapper;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    @Insert("INSERT INTO hz (name,gender,did) VALUES (#{name},#{gender},#{did})")
    void save(User user);

    @Select("SELECT * FROM hz")
    List<User> findAll();

    List<User> findById(String is);
}
