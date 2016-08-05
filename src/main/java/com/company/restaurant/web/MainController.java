package com.company.restaurant.web;

import com.company.restaurant.service.CommonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Yevhen on 28.07.2016.
 */
@Controller
public class MainController {
    private static final String MAIN_PAGE_VIEW_NAME = "index";
    private static final String RESTAURANT_NAME_VAR_NAME = "restaurantName";
    private static final String RESTAURANT_ADDRESS_VAR_NAME = "restaurantAddress";
    private static final String RESTAURANT_E_MAIL_VAR_NAME = "restaurantEMail";
    private static final String RESTAURANT_PHONE_NUMBERS_VAR_NAME = "restaurantPhoneNumbers";
    private static final String RESTAURANT_EMBLEM_IMAGE_VAR_NAME = "restaurantEmblemImage";
    private static final String RESTAURANT_TRANSPORT_IMAGE_MAP_VAR_NAME = "restaurantTransportMapImage";
    private static final String RESTAURANT_RESTAURANT_SCHEMA_IMAGE_MAP_VAR_NAME = "restaurantRestaurantSchema";

    private CommonDataService commonDataService;

    @Autowired
    public void setCommonDataService(CommonDataService commonDataService) {
        this.commonDataService = commonDataService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject(RESTAURANT_NAME_VAR_NAME, commonDataService.getRestaurantName());
        modelAndView.addObject(RESTAURANT_ADDRESS_VAR_NAME, commonDataService.getRestaurantAddress());
        modelAndView.addObject(RESTAURANT_E_MAIL_VAR_NAME, commonDataService.getRestaurantEMail());
        modelAndView.addObject(RESTAURANT_PHONE_NUMBERS_VAR_NAME, commonDataService.getPhoneNumbers());
        modelAndView.addObject(RESTAURANT_EMBLEM_IMAGE_VAR_NAME, commonDataService.getEmblemImage());
        modelAndView.addObject(RESTAURANT_TRANSPORT_IMAGE_MAP_VAR_NAME, commonDataService.getTransportMapImage());
        modelAndView.addObject(RESTAURANT_RESTAURANT_SCHEMA_IMAGE_MAP_VAR_NAME,
                commonDataService.getRestaurantSchemeImage());

        modelAndView.setViewName(MAIN_PAGE_VIEW_NAME);

        return modelAndView;
    }
}
