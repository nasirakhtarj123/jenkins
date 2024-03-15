package com.employee.emp_management.dto;

import java.util.Date;

public class AttendanceDTO {
    private Long id;
    private Integer empId;
    private Date date;
    private Date lateBy;
    private Date earlyBy;
    private Date overTime;
    private Date workingTime;
    private Date createdDateTime;
    private Date updatedDateTime;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getEmpId() {
        return empId;
    }
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getLateBy() {
        return lateBy;
    }
    public void setLateBy(Date lateBy) {
        this.lateBy = lateBy;
    }
    public Date getEarlyBy() {
        return earlyBy;
    }
    public void setEarlyBy(Date earlyBy) {
        this.earlyBy = earlyBy;
    }
    public Date getOverTime() {
        return overTime;
    }
    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }
    public Date getWorkingTime() {
        return workingTime;
    }
    public void setWorkingTime(Date workingTime) {
        this.workingTime = workingTime;
    }
    public Date getCreatedDateTime() {
        return createdDateTime;
    }
    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }
    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    // Constructors, getters, setters
}
