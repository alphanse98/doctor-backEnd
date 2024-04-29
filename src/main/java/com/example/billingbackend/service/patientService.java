package com.example.billingbackend.service;

import com.example.billingbackend.entity.PatientEntity;

import java.util.List;

public class patientService {

    List<PatientEntity> getPatient();
    PatientEntity createPatient(PatientEntity request);
    PatientEntity updatePatient (PatientEntity request);
    void deletePatient(PatientEntity request);
}
