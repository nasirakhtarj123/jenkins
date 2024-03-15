package com.employee.emp_management.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class EmpInvitationDTO {

    private Long id;
    private String empId;
    private String empEmail;
    private String status;
    private Long sendById;
    private Date createdDateTime;
    private Date updatedDateTime;

    public EmpInvitationDTO() {
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

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSendById() {
        return sendById;
    }

    public void setSendById(Long sendById) {
        this.sendById = sendById;
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

    public EmpInvitationDTO(Long id, String empId, String empEmail, String status, Long sendById,
            Date createdDateTime, Date updatedDateTime) {
        this.id = id;
        this.empId = empId;
        this.empEmail = empEmail;
        this.status = status;
        this.sendById = sendById;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
    }

}
