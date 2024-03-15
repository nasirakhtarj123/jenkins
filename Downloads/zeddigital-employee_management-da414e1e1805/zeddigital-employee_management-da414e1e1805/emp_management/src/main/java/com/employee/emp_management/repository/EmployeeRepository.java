package com.employee.emp_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.emp_management.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

