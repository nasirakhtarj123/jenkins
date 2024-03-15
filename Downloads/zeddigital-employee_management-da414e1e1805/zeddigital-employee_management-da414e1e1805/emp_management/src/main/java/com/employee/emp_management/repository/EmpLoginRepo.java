package com.employee.emp_management.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.emp_management.employee.EmpLogin;

public interface EmpLoginRepo extends JpaRepository<EmpLogin, Long> {
    // You can add custom query methods here if needed
}

