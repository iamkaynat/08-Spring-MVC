package org.springmvc.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String id;
    private String name;

    private String department;
    private String salary;
    public Employee(){

    }
    public Employee(String id , String name , String department , String salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID : " + id + "Department :" + department + "Name :" + name + "Salary :" + salary;
    }
}
