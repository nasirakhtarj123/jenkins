package com.employee.emp_management.dto;

import java.util.Date;

public class EmpInfoDTO {
    private Long id;
    private Integer empId;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private Date dob;
    private String address;
    private String emergencyNumber;
    private byte[] photo;
    private Date joiningDate;
    private String status;
    private String empType;
    private String position;
    private String updateStatus;
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
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmergencyNumber() {
        return emergencyNumber;
    }
    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }
    public byte[] getPhoto() {
        return photo;
    }
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    public Date getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getEmpType() {
        return empType;
    }
    public void setEmpType(String empType) {
        this.empType = empType;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getUpdateStatus() {
        return updateStatus;
    }
    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
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
