package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @Author: Summer
 * @Time: 2020/1/28 11:11
 */
@Controller
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/queryItems")
    public String queryItems(Model model){
        List<Items> itemsList = itemsService.queryItems();
        model.addAttribute("itemsList",itemsList);
        return "itemsList";
    }
    @RequestMapping("/editItems")
    public String editItems(Integer id,Model model){
        Items items = itemsService.findById(id);
        model.addAttribute("items",items);
        return "editItems";
    }
    @RequestMapping("/updateItems")
    public String updateItems(Items items, @RequestParam(value = "pictureFile",required = true,defaultValue = "null") MultipartFile pictureFile) throws IOException {
        System.out.println(items);
        System.out.println(pictureFile);
        if(pictureFile!=null) {
            String filename = items.getId() + "--" + pictureFile.getOriginalFilename();
            System.out.println(pictureFile);
            items.setPic(filename);
            String path = "http://localhost:80/ssm_item/pic/";
            filename = path + filename;
            Client client = Client.create();
            WebResource resource = client.resource(filename);
            resource.put(pictureFile.getBytes());
        }
        itemsService.updateItems(items);
        return "redirect:/items/queryItems.action";
    }
}
