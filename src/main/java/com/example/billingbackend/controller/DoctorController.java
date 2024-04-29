package com.example.billingbackend.controller;

import com.example.billingbackend.entity.DoctorEntity;
import com.example.billingbackend.service.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class DoctorController {

    DoctorService EmployeeService;

    @GetMapping("api/getDoctor")
    public ResponseEntity<List<DoctorEntity>> getDoctor(){
      List<DoctorEntity> res = EmployeeService.getDoctor();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("api/createDoctor")
        public ResponseEntity<DoctorEntity> createDoctor(@RequestBody DoctorEntity request){
        DoctorEntity res = EmployeeService.createDoctor(request);
        return new ResponseEntity<> (res,HttpStatus.CREATED);
    }

//    @DeleteMapping("api/deleteEmployee")
    @PostMapping("api/deleteDoctor")
    public ResponseEntity<String> deleteDoctor(@RequestBody DoctorEntity request){
        EmployeeService.updateDoctor(request);
        return  new ResponseEntity<>("Deleted Employee", HttpStatus.OK);
    }

    @PutMapping("api/updateDoctor")
    public ResponseEntity<DoctorEntity> updateDoctor(@RequestBody DoctorEntity request){
        DoctorEntity res = EmployeeService.deleteDoctor(request);
        return new ResponseEntity<> (res,HttpStatus.UPGRADE_REQUIRED);
    }

}
