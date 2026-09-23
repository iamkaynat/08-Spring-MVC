package org.springmvc.service;

import org.springframework.stereotype.Service;
import org.springmvc.model.Employee;
import org.springmvc.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;

    }
    public List<Employee> getAllEmployees(){

        return employeeRepository.getAllEmployees();
    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.addEmployee(employee);
    }
    public Employee getEmployeeById(String id){

        return employeeRepository.getEmployeeById(id);
    }
    public String deleteEmployee(String id){
        return  employeeRepository.deleteEmployee(id);
    }

    public List<Employee> getEmployeeByDepartment(String department){
        return employeeRepository.getEmployeeByDepartment(department);
    }
}
