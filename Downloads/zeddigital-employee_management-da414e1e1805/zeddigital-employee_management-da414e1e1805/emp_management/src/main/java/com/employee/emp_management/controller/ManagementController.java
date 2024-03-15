package com.employee.emp_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.employee.emp_management.dto.AttendanceDTO;
import com.employee.emp_management.dto.EmpInfoDTO;
import com.employee.emp_management.dto.EmpInvitationDTO;
import com.employee.emp_management.dto.EmpLeaveDTO;
import com.employee.emp_management.dto.EmpLoginDTO;
import com.employee.emp_management.dto.MasterLeaveDTO;
import com.employee.emp_management.employee.EmpInvitation;
import com.employee.emp_management.employee.EmpLogin;
import com.employee.emp_management.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ManagementController {

    @Autowired
    private EmployeeService employeeService;

    // EmpLogin endpoints
    @GetMapping("/emp-logins")
    public List<EmpLoginDTO> getAllEmpLogins() {
        return employeeService.getAllEmpLogins();
    }

    @GetMapping("/emp-logins/{id}")
    public EmpLoginDTO getEmpLoginById(@PathVariable Long id) {
        return employeeService.getEmpLoginById(id);
    }

    @PostMapping("/emp-logins")
    public EmpLoginDTO createEmpLogin(@RequestBody EmpLoginDTO empLoginDTO) {
        return employeeService.createEmpLogin(empLoginDTO);
    }

    @PutMapping("/emp-logins/{id}")
    public EmpLoginDTO updateEmpLogin(@PathVariable Long id, @RequestBody EmpLoginDTO empLoginDTO) {
        return employeeService.updateEmpLogin(id, empLoginDTO);
    }

    @DeleteMapping("/emp-logins/{id}")
    public void deleteEmpLogin(@PathVariable Long id) {
        employeeService.deleteEmpLogin(id);
    }

    // EmpInvitation endpoints
    @PostMapping("/emp-invitations")
    public EmpInvitationDTO createEmpInvitation(@RequestBody EmpInvitationDTO empInvitationDTO) {
        return employeeService.createEmpInvitation(empInvitationDTO);
    }

    @GetMapping("/emp-invitations")
    public List<EmpInvitationDTO> getAllEmpInvitations() {
        return employeeService.getAllEmpInvitations();
    }

    @GetMapping("/emp-invitations/{id}")
    public EmpInvitationDTO getEmpInvitationById(@PathVariable Long id) {
        return employeeService.getEmpInvitationById(id);
    }

    @PutMapping("/emp-invitations/{id}")
    public EmpInvitationDTO updateEmpInvitation(@PathVariable Long id, @RequestBody EmpInvitationDTO empInvitationDTO) {
        return employeeService.updateEmpInvitation(id, empInvitationDTO);
    }

    @DeleteMapping("/emp-invitations/{id}")
    public void deleteEmpInvitation(@PathVariable Long id) {
        employeeService.deleteEmpInvitation(id);
    }

    // EmployeeLeave endpoints
    @PostMapping("/employee-leaves")
    public MasterLeaveDTO createEmployeeLeave(@RequestBody MasterLeaveDTO masterLeaveDTO) {
        return employeeService.createMasterLeave(masterLeaveDTO);
    }

    @GetMapping("/employee-leaves")
    public List<MasterLeaveDTO> getAllEmployeeLeaves() {
        return employeeService.getAllMasterLeaves();
    }

    @GetMapping("/employee-leaves/{id}")
    public MasterLeaveDTO getEmployeeLeaveById(@PathVariable Long id) {
        return employeeService.getMasterLeaveById(id);
    }

    @PutMapping("/employee-leaves/{id}")
    public MasterLeaveDTO updateEmployeeLeave(@PathVariable Long id, @RequestBody MasterLeaveDTO masterLeaveDTO) {
        return employeeService.updateMasterLeave(id, masterLeaveDTO);
    }

}
