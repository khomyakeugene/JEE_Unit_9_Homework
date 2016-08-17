package com.company.restaurant.web;

import com.company.restaurant.model.Menu;
import com.company.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Yevhen on 17.08.2016.
 */

@RestController
public class RestMenuController {
    private MenuService menuService;

    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }

    @RequestMapping(value="/menus", method = RequestMethod.POST)
    @ResponseBody
    List<Menu> getMenuList() {
        return menuService.findAllMenus();
    }
}
