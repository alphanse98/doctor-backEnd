package com.example.billingbackend.controller;


import com.example.billingbackend.entity.PatientEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class PatientController {


    @GetMapping("api/getPatient")
    public ResponseEntity<List<PatientEntity>> getPatient(){
        List<PatientEntity> res = EmployeeService.getPatient();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("api/createPatient")
    public ResponseEntity<PatientEntity> createPatient(@RequestBody PatientEntity request){
        PatientEntity res = EmployeeService.createPatient(request);
        return new ResponseEntity<> (res,HttpStatus.CREATED);
    }

    //    @DeleteMapping("api/deleteEmployee")
    @PostMapping("api/deletePatient")
    public ResponseEntity<String> deletePatient(@RequestBody PatientEntity request){
        EmployeeService.updatePatient(request);
        return  new ResponseEntity<>("Deleted Employee", HttpStatus.OK);
    }

    @PutMapping("api/updatePatient")
    public ResponseEntity<PatientEntity> updatePatient(@RequestBody PatientEntity request){
        PatientEntity res = EmployeeService.deletePatient(request);
        return new ResponseEntity<> (res,HttpStatus.UPGRADE_REQUIRED);
    }
}
