package com.Hospital.controller;

import com.Hospital.model.Doctor;
import com.Hospital.service.DoctorService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/doctor")
public class DoctorController {
    @Autowired
    DoctorService service;
    @PostMapping("saveDoctor")//✅
    private ResponseEntity<String> saveDoctor(@RequestBody Doctor doctor){
        Doctor response = service.saveDoctor(doctor);
        return new ResponseEntity<>(response.getDoctorName() + " Saved!", HttpStatus.CREATED);
    }
    @GetMapping("getDoctor")//✅
    private ResponseEntity<String> getDoctor(@Nullable @RequestParam Integer doctorId){
        JSONArray response = service.getDoctor(doctorId);
        if(response.length() == 0)
            return new ResponseEntity<>("Requested Doctor not found!", HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(response.toString(), HttpStatus.OK);
    }
    @PutMapping("updateDoctor")//✅
    private ResponseEntity<String> updateDoctor(@RequestBody Doctor doctor, @RequestParam Integer doctorId){
        String response = service.updateDoctor(doctorId, doctor);
        if(response.length() == 0)
            return new ResponseEntity<>("Requested Doctor not found!", HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>("doctor with name " + response + " Updated!", HttpStatus.OK);
    }
    @DeleteMapping("deleteDoctor")//✅
    private ResponseEntity<String> deleteDoctor(@RequestParam Integer doctorId){
        String response = service.deleteDoctor(doctorId);
        if(response.length() == 0)
            return new ResponseEntity<>("Requested Doctor not found!", HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>("doctor with name " + response + " Deleted!", HttpStatus.OK);
    }
}
