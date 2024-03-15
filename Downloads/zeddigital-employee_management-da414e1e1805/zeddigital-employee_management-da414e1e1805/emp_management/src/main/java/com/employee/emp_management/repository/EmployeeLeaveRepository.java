package com.employee.emp_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.emp_management.employee.EmployeeLeave;

public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave, Long> {
}
