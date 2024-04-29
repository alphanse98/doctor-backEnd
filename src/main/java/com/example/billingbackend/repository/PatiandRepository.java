package com.example.billingbackend.repository;

import com.example.billingbackend.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PatiandRepository extends JpaRepository<DoctorEntity,Long> {
}
