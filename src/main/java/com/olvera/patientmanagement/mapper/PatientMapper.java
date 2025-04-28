package com.olvera.patientmanagement.mapper;

import com.olvera.patientmanagement.dto.PatientResponseDTO;
import com.olvera.patientmanagement.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        return PatientResponseDTO.builder()
                .id(patient.getId().toString())
                .name(patient.getName())
                .email(patient.getEmail())
                .address(patient.getAddress())
                .dateOfBirth(patient.getDateOfBirth().toString())
                .registeredDate(patient.getRegisteredDate().toString())
                .build();
    }
}
