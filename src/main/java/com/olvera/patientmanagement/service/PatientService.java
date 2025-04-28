package com.olvera.patientmanagement.service;

import com.olvera.patientmanagement.dto.PatientResponseDTO;
import com.olvera.patientmanagement.mapper.PatientMapper;
import com.olvera.patientmanagement.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        return patientRepository.findAll().stream()
                .map(PatientMapper::toDTO).toList();
    }

}
