package com.example.billingbackend.service;

import com.example.billingbackend.entity.DoctorEntity;

import java.util.List;

public interface DoctorService {
    List<DoctorEntity> getDoctor();
    DoctorEntity createDoctor(DoctorEntity request);
    DoctorEntity updateDoctor (DoctorEntity request);
    void deleteDoctor(DoctorEntity request);

}
