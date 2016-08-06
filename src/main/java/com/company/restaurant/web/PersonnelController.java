package com.company.restaurant.web;

import com.company.restaurant.web.proto.CommonDataController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Yevhen on 06.08.2016.
 */
@Controller
public class PersonnelController extends CommonDataController {
    private static final String PERSONNEL_PAGE_VIEW_NAME = "/personnel-page";

    @RequestMapping(value = "/personnel", method = RequestMethod.GET)
    public ModelAndView perPage() {
        initData();

        modelAndView.setViewName(PERSONNEL_PAGE_VIEW_NAME);

        return modelAndView;
    }
}
