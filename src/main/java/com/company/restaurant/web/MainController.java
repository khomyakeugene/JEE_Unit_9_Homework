package com.company.restaurant.web;

import com.company.restaurant.service.CommonDataService;
import com.company.restaurant.service.CourseService;
import com.company.restaurant.web.proto.CommonDataController;
import com.company.restaurant.web.proto.ControllerProto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Base64;

/**
 * Created by Yevhen on 28.07.2016.
 */
@Controller
public class MainController extends CommonDataController {
    private static final String MAIN_PAGE_VIEW_NAME = "main-page";
    private static final String COURSES_VAR_NAME = "courses";

    private CourseService courseService;

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView mainPage() {
        initData();

        modelAndView.addObject(COURSES_VAR_NAME, courseService.findAllCourses());
        modelAndView.setViewName(MAIN_PAGE_VIEW_NAME);

        return modelAndView;
    }
}
