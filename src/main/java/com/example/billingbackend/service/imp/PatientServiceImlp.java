package com.example.billingbackend.service.imp;

import com.example.billingbackend.entity.PatientEntity;
import com.example.billingbackend.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientServiceImlp implements  patienService {

    PatientRepository EmployeeRepository;
    @Override
    public List<PatientEntity> getPatient() {
        return EmployeeRepository.findAll();
    }

    @Override
    public PatientEntity createPatient(PatientEntity request) {
        return EmployeeRepository.save(request);
    }

    @Override
    public PatientEntity updatePatient(PatientEntity request) {
        return EmployeeRepository.save(request);
    }

    @Override
    public void deletePatient(PatientEntity request) {
        EmployeeRepository.delete(request);
        return ;
    }
}
