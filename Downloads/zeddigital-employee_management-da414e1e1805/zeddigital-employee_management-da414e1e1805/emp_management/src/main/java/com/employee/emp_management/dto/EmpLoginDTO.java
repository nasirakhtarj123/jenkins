package com.employee.emp_management.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class EmpLoginDTO {

    private Long id;
    private String empId;
    private String name;
    private String username;
    private String password;
    private String role;
    private String status;
    private Date lastSign;
    private Date createdDateTime;
    private Date updatedDateTime;

    public EmpLoginDTO() {
        // Default constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastSign() {
        return lastSign;
    }

    public void setLastSign(Date date) {
        this.lastSign = date;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date date) {
        this.createdDateTime = date;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date date) {
        this.updatedDateTime = date;
    }
}
