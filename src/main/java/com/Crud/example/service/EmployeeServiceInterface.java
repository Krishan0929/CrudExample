package com.Crud.example.service;

import com.Crud.example.entity.Employee;

import java.util.List;

public interface EmployeeServiceInterface
{
    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmpById(Long empidL);

    public void deleteEmpById(Long empidL);
}
