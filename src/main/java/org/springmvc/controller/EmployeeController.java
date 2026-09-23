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
    @GetMapping("/employees/{id}")
    @ResponseBody
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    @ResponseBody
    public String deleteEmployee(@PathVariable("id") int id){
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
    // --------------------------------------------------
    // DISPLAY REGISTRATION FORM
    // --------------------------------------------------

    @GetMapping("/employees/register")
    public String showRegistrationForm() {

        return "employee-form";
    }

    @PostMapping("/employees/register")
    @ResponseBody
    public String regsiterEmployee(@RequestParam("name") String name,
                                   @RequestParam("department") String department,
                                   @RequestParam("salary") String salary){
        Employee employee = new Employee(name,department,salary);
        Employee savedEmployee = addEmployee(employee);
        return """
                Employee registered successfully!

                ID: %d
                Name: %s
                Department: %s
                Salary: %s
                """.formatted(
                savedEmployee.getId(),
                savedEmployee.getName(),
                savedEmployee.getDepartment(),
                savedEmployee.getSalary()
        );
    }



}
