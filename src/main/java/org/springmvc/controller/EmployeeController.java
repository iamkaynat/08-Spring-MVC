package org.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import jakarta.annotation.PostConstruct;
import org.springmvc.model.Employee;
import org.springmvc.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {
    @PostConstruct
    public void init() {

        System.out.println(">>> EmployeeController CREATED");
    }
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping("/employees")
    @ResponseBody
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    @ResponseBody
    public String deleteEmployee(@PathVariable("id") String id){
        String delete = employeeService.deleteEmployee(id);
        if(delete.equals("S"))
            return "Employee deleted successfully";
        else
            return "Failed to delete employee";
    }
    @GetMapping("employees/search")
    @ResponseBody
    public List<Employee> getEmployeesByDepartment(@RequestParam("department") String department){
        return employeeService.getEmployeeByDepartment(department);
    }

}
