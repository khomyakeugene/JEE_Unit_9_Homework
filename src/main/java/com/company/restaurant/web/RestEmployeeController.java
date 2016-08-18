package com.company.restaurant.web;

import com.company.restaurant.model.Employee;
import com.company.restaurant.model.Menu;
import com.company.restaurant.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yevhen on 18.08.2016.
 */

@RestController
public class RestEmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value="/employees", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getEmployeeList() {
        return employeeService.findAllEmployeeNames();
    }

    @RequestMapping(value="/employees/employee_id/{employeeId}", method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmployeeById(@PathVariable int employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }
}
