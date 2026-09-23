package org.springmvc.repository;

import org.springframework.stereotype.Repository;
import org.springmvc.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepository {
    Map<Integer, Employee> hashMap = new HashMap<>();
    private int nextId= 106;
    public EmployeeRepository(){
        hashMap.put(1, new Employee(1,"Kayo", "Engineering", "70000"));
        hashMap.put(2, new Employee(2,"Kayo", "Engineering", "70000"));
        hashMap.put(3, new Employee(3,"Kayo", "Engineering", "70000"));
        hashMap.put(4, new Employee(4,"Kayo", "Engineering", "70000"));

    }
    public Employee addEmployee(Employee employee){
        employee.setId(nextId);
        hashMap.put(nextId++, employee);
        return employee;
    }
    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        hashMap.forEach((s, employee) -> employeeList.add(employee));
        return employeeList;
    }

    public Employee getEmployeeById(int id){
        return hashMap.get(id);
    }

    public String deleteEmployee(int id){
        hashMap.remove(id);
        return "S";
    }

    public List<Employee> getEmployeeByDepartment(String department){
        List<Employee> employeeList = new ArrayList<>();
        hashMap.forEach((s, employee)->
        {
            if(department.equalsIgnoreCase(employee.getDepartment()))
                employeeList.add(employee);
        });
        System.out.println(employeeList.size());
        return employeeList;
    }
}
