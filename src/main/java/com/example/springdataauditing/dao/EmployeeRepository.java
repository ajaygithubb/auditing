package com.example.springdataauditing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdataauditing.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
