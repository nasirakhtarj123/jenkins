package com.employee.emp_management.dto;

import java.util.Date;

public class MasterLeaveDTO {

    private Long id;
    private String experienceDuration;
    private int numberOfDays;
    private Date createdDateTime;
    private Date updatedDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExperienceDuration() {
        return experienceDuration;
    }

    public void setExperienceDuration(String experienceDuration) {
        this.experienceDuration = experienceDuration;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
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

    public MasterLeaveDTO() {
        // Default constructor
    }

    public MasterLeaveDTO(Long id, String experienceDuration, int numberOfDays, Date createdDateTime,
            Date updatedDateTime) {
        this.id = id;
        this.experienceDuration = experienceDuration;
        this.numberOfDays = numberOfDays;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
    }
}
