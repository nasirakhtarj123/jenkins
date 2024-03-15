package com.employee.emp_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import com.employee.emp_management.dto.EmpInvitationDTO;
import com.employee.emp_management.dto.EmpLoginDTO;
import com.employee.emp_management.dto.MasterLeaveDTO;
import com.employee.emp_management.employee.EmpInvitation;
import com.employee.emp_management.employee.EmpLogin;

import com.employee.emp_management.employee.MasterLeave;
import com.employee.emp_management.repository.EmpInvitationRepo;
import com.employee.emp_management.repository.EmpLoginRepo;
import com.employee.emp_management.repository.MasterLeaveRepo;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmpLoginRepo empLoginRepo;
    @Autowired
    private EmpInvitationRepo empInvitationRepo;

    @Autowired
    private MasterLeaveRepo masterLeaveRepository;

    // EmpLogin methods
    public EmpLoginDTO createEmpLogin(EmpLoginDTO empLoginDTO) {
        EmpLogin empLogin = convertToEntity(empLoginDTO);
        empLogin = empLoginRepo.save(empLogin);
        return convertToDTO(empLogin);
    }

    public List<EmpLoginDTO> getAllEmpLogins() {
        List<EmpLogin> empLogins = empLoginRepo.findAll();
        return empLogins.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public EmpLoginDTO getEmpLoginById(Long id) {
        EmpLogin empLogin = empLoginRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee login not found with id: " + id));
        return convertToDTO(empLogin);
    }

    public void deleteEmpLogin(Long id) {
        empLoginRepo.deleteById(id);
    }

    public EmpLoginDTO updateEmpLogin(Long id, EmpLoginDTO empLoginDTO) {
        EmpLogin existingLogin = empLoginRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee login not found with id: " + id));

        // Update the fields
        existingLogin.setName(empLoginDTO.getName());
        existingLogin.setUsername(empLoginDTO.getUsername());
        existingLogin.setPassword(empLoginDTO.getPassword());
        existingLogin.setRole(empLoginDTO.getRole());
        existingLogin.setStatus(empLoginDTO.getStatus());
        existingLogin.setLastSign(empLoginDTO.getLastSign());
        existingLogin.setUpdatedDateTime(empLoginDTO.getUpdatedDateTime());

        // Save and return the updated entity
        return convertToDTO(empLoginRepo.save(existingLogin));
    }

    // EmpInvitation methods
    public EmpInvitationDTO createEmpInvitation(EmpInvitationDTO empInvitationDTO) {
        EmpInvitation empInvitation = convertToEntity(empInvitationDTO);
        empInvitation = empInvitationRepo.save(empInvitation);
        return convertToDTO(empInvitation);
    }

    public List<EmpInvitationDTO> getAllEmpInvitations() {
        List<EmpInvitation> empInvitations = empInvitationRepo.findAll();
        return empInvitations.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public EmpInvitationDTO getEmpInvitationById(Long id) {
        EmpInvitation empInvitation = empInvitationRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee invitation not found with id: " + id));
        return convertToDTO(empInvitation);
    }

    public void deleteEmpInvitation(Long id) {
        empInvitationRepo.deleteById(id);
    }

    public EmpInvitationDTO updateEmpInvitation(Long id, EmpInvitationDTO empInvitationDTO) {
        EmpInvitation existingInvitation = empInvitationRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee invitation not found with id: " + id));

        // Update the fields
        existingInvitation.setEmpEmail(empInvitationDTO.getEmpEmail());
        existingInvitation.setStatus(empInvitationDTO.getStatus());
        existingInvitation.setSendById(empInvitationDTO.getSendById());
        existingInvitation.setUpdatedDateTime(empInvitationDTO.getUpdatedDateTime());

        // Save and return the updated entity
        return convertToDTO(empInvitationRepo.save(existingInvitation));
    }

    // Conversion methods
    private EmpLoginDTO convertToDTO(EmpLogin empLogin) {
        EmpLoginDTO empLoginDTO = new EmpLoginDTO();
        empLoginDTO.setId(empLogin.getId());
        empLoginDTO.setEmpId(empLogin.getEmpId());
        empLoginDTO.setName(empLogin.getName());
        empLoginDTO.setUsername(empLogin.getUsername());
        empLoginDTO.setPassword(empLogin.getPassword());
        empLoginDTO.setRole(empLogin.getRole());
        empLoginDTO.setStatus(empLogin.getStatus());
        empLoginDTO.setLastSign(empLogin.getLastSign());
        empLoginDTO.setCreatedDateTime(empLogin.getCreatedDateTime());
        empLoginDTO.setUpdatedDateTime(empLogin.getUpdatedDateTime());
        return empLoginDTO;
    }

    private EmpLogin convertToEntity(EmpLoginDTO empLoginDTO) {
        EmpLogin empLogin = new EmpLogin();
        empLogin.setId(empLoginDTO.getId());
        empLogin.setEmpId(empLoginDTO.getEmpId());
        empLogin.setName(empLoginDTO.getName());
        empLogin.setUsername(empLoginDTO.getUsername());
        empLogin.setPassword(empLoginDTO.getPassword());
        empLogin.setRole(empLoginDTO.getRole());
        empLogin.setStatus(empLoginDTO.getStatus());
        empLogin.setLastSign(empLoginDTO.getLastSign());
        empLogin.setCreatedDateTime(empLoginDTO.getCreatedDateTime());
        empLogin.setUpdatedDateTime(empLoginDTO.getUpdatedDateTime());
        return empLogin;
    }

    private EmpInvitationDTO convertToDTO(EmpInvitation empInvitation) {
        EmpInvitationDTO empInvitationDTO = new EmpInvitationDTO();
        empInvitationDTO.setId(empInvitation.getId());
        empInvitationDTO.setEmpId(empInvitation.getEmpId());
        empInvitationDTO.setEmpEmail(empInvitation.getEmpEmail());
        empInvitationDTO.setStatus(empInvitation.getStatus());
        empInvitationDTO.setSendById(empInvitation.getSendById());
        empInvitationDTO.setCreatedDateTime(empInvitation.getCreatedDateTime());
        empInvitationDTO.setUpdatedDateTime(empInvitation.getUpdatedDateTime());
        // Set other properties similarly
        return empInvitationDTO;
    }

    private EmpInvitation convertToEntity(EmpInvitationDTO empInvitationDTO) {
        EmpInvitation empInvitation = new EmpInvitation();
        empInvitation.setId(empInvitationDTO.getId());
        empInvitation.setEmpId(empInvitationDTO.getEmpId());
        empInvitation.setEmpEmail(empInvitationDTO.getEmpEmail());
        empInvitation.setStatus(empInvitationDTO.getStatus());
        empInvitation.setSendById(empInvitationDTO.getSendById());
        empInvitation.setCreatedDateTime(empInvitationDTO.getCreatedDateTime());
        empInvitation.setUpdatedDateTime(empInvitationDTO.getUpdatedDateTime());
        // Set other properties similarly
        return empInvitation;
    }

    // MasterLeave methods
    public MasterLeaveDTO createMasterLeave(MasterLeaveDTO masterLeaveDTO) {
        MasterLeave masterLeave = convertToEntity(masterLeaveDTO);
        masterLeave = masterLeaveRepository.save(masterLeave);
        return convertToDTO(masterLeave);
    }

    public List<MasterLeaveDTO> getAllMasterLeaves() {
        List<MasterLeave> masterLeaves = masterLeaveRepository.findAll();
        return masterLeaves.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public MasterLeaveDTO getMasterLeaveById(Long id) {
        MasterLeave masterLeave = masterLeaveRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Master leave not found with id: " + id));
        return convertToDTO(masterLeave);
    }

    public MasterLeaveDTO updateMasterLeave(Long id, MasterLeaveDTO masterLeaveDTO) {
        MasterLeave existingLeave = masterLeaveRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Master leave not found with id: " + id));

        // Update the fields
        existingLeave.setExperienceDuration(masterLeaveDTO.getExperienceDuration());
        existingLeave.setNumberOfDays(masterLeaveDTO.getNumberOfDays());
        existingLeave.setUpdatedDateTime(masterLeaveDTO.getUpdatedDateTime());

        // Save and return the updated entity
        return convertToDTO(masterLeaveRepository.save(existingLeave));
    }

    // Conversion methods
    private MasterLeaveDTO convertToDTO(MasterLeave masterLeave) {
        MasterLeaveDTO masterLeaveDTO = new MasterLeaveDTO();
        masterLeaveDTO.setId(masterLeave.getId());
        masterLeaveDTO.setExperienceDuration(masterLeave.getExperienceDuration());
        masterLeaveDTO.setNumberOfDays(masterLeave.getNumberOfDays());
        masterLeaveDTO.setCreatedDateTime(masterLeave.getCreatedDateTime());
        masterLeaveDTO.setUpdatedDateTime(masterLeave.getUpdatedDateTime());
        // Set other properties similarly
        return masterLeaveDTO;
    }

    private MasterLeave convertToEntity(MasterLeaveDTO masterLeaveDTO) {
        MasterLeave masterLeave = new MasterLeave();
        masterLeave.setId(masterLeaveDTO.getId());
        masterLeave.setExperienceDuration(masterLeaveDTO.getExperienceDuration());
        masterLeave.setNumberOfDays(masterLeaveDTO.getNumberOfDays());
        masterLeave.setCreatedDateTime(masterLeaveDTO.getCreatedDateTime());
        masterLeave.setUpdatedDateTime(masterLeaveDTO.getUpdatedDateTime());
        // Set other properties similarly
        return masterLeave;
    }
}