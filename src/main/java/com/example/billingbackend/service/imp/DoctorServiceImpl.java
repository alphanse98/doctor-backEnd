package com.example.billingbackend.service.imp;

import com.example.billingbackend.entity.DoctorEntity;
import com.example.billingbackend.repository.DoctorRepository;
import com.example.billingbackend.service.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    DoctorRepository EmployeeRepository;
    @Override
    public List<DoctorEntity> getDoctor() {
        return EmployeeRepository.findAll();
    }

    @Override
    public DoctorEntity createDoctor(DoctorEntity request) {
        return EmployeeRepository.save(request);
    }

    @Override
    public DoctorEntity updateDoctor(DoctorEntity request) {
        return EmployeeRepository.save(request);
    }

    @Override
    public void deleteDoctor(DoctorEntity request) {
        EmployeeRepository.delete(request);
        return ;
    }
}
