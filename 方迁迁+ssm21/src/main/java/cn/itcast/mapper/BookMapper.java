package cn.itcast.mapper;

import cn.itcast.domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Summer
 * @Time: 2020/1/19 14:44
 */
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();
}
