package cn.itcast.mapper;

import cn.itcast.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author: Summer
 * @Time: 2020/1/21 17:19
 */
public interface ItemsMapper {
    @Select("select * from items")
    List<Items> queryItems();

    @Select("select * from items where id=#{id}")
    Items findById(Integer id);

    @Update("update items set name=#{name},price=#{price},pic=#{pic},createtime=#{createtime},detail=#{detail} where id=#{id}")
    void updateItems(Items items);
}
