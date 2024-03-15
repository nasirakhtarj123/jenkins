package com.employee.emp_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.emp_management.employee.MasterLeave;

public interface MasterLeaveRepo extends JpaRepository<MasterLeave, Long> {
    // You can add custom query methods here if needed
}


