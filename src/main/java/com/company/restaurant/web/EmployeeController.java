package com.company.restaurant.web;

import com.company.restaurant.service.impl.EmployeeServiceImpl;
import com.company.restaurant.web.proto.ControllerProto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Yevhen on 28.07.2016.
 */
@Controller
public class EmployeeController extends ControllerProto {
    private EmployeeServiceImpl employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String employees(Map<String, Object> model) {
        model.put("employees", employeeService.findAllEmployees());

        return "employees";
    }
    @Autowired
    public void setEmployeeService(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

}
