package com.company.restaurant.web;

import com.company.restaurant.service.CommonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * Created by Yevhen on 28.07.2016.
 */
@Controller
public class MainController {
    private CommonDataService commonDataService;

    @Autowired
    public void setCommonDataService(CommonDataService commonDataService) {
        this.commonDataService = commonDataService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("restaurantName", commonDataService.getRestaurantName());

        modelAndView.setViewName("index");

        return modelAndView;
    }
}
