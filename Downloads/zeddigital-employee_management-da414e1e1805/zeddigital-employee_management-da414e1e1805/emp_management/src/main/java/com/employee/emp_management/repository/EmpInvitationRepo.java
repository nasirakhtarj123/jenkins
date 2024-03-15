package com.employee.emp_management.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.emp_management.employee.EmpInvitation;

public interface EmpInvitationRepo extends JpaRepository<EmpInvitation, Long> {
    // You can add custom query methods here if needed
}

    

