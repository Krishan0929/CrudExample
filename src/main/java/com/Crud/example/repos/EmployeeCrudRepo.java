package com.Crud.example.repos;


import com.Crud.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCrudRepo extends JpaRepository<Employee,Long>
{

}
