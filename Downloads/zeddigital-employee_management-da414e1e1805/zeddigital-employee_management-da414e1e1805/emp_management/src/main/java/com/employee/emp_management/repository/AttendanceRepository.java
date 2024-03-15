package com.employee.emp_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.emp_management.employee.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
