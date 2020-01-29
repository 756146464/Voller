package cn.itcast.service;

import cn.itcast.domain.Items;

import java.util.List;

/**
 * @Author: Summer
 * @Time: 2020/1/21 17:18
 */
public interface ItemsService {

    List<Items> queryItems();

    Items findById(Integer id);

    void updateItems(Items items);
}
