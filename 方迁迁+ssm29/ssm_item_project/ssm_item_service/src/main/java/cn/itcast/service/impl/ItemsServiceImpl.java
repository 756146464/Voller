package cn.itcast.service.impl;

import cn.itcast.domain.Items;
import cn.itcast.mapper.ItemsMapper;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Summer
 * @Time: 2020/1/21 17:18
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> queryItems() {
        return itemsMapper.queryItems();
    }

    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }


    public void updateItems(Items items) {
        itemsMapper.updateItems(items);
    }
}
