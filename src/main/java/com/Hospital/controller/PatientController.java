package com.Hospital.controller;

import com.Hospital.model.Patient;
import com.Hospital.service.PatientService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/patient")
public class PatientController {
    @Autowired
    PatientService service;
    @PostMapping("savePatient")//✅
    private ResponseEntity<String> savePatient(@RequestBody Patient patient){
        Patient response = service.savePatient(patient);
        if(response != null)
            return new ResponseEntity<>(response.getPatientName() + " Saved!", HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Doctor Not Found!", HttpStatus.BAD_REQUEST);
    }
    @GetMapping("getPatient")//✅
    private ResponseEntity<String> getPatient(@Nullable @RequestParam Integer patientId){
        JSONArray response = service.getPatient(patientId);
        if(response.length() == 0)
            return new ResponseEntity<>("Requested Patient not found!", HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(response.toString(), HttpStatus.OK);
    }
    @PutMapping("updatePatient")//✅
    private ResponseEntity<String> updatePatient(@RequestBody Patient patient, @RequestParam Integer patientId){
        String response = service.updatePatient(patientId, patient);
        if(response == null){
            return new ResponseEntity<>("Requested Doctor not found!", HttpStatus.NOT_FOUND);
        }else{
            if(response.length() == 0)
                return new ResponseEntity<>("Requested Patient not found!", HttpStatus.NOT_FOUND);
            else
                return new ResponseEntity<>("Patient with name " + response + " Updated!", HttpStatus.OK);
        }
    }
    @DeleteMapping("deletePatient")//✅
    private ResponseEntity<String> deletePatient(@RequestParam Integer patientId){
        String response = service.deletePatient(patientId);
        if(response.length() == 0)
            return new ResponseEntity<>("Requested Patient not found!", HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>("patient with name " + response + " Deleted!", HttpStatus.OK);
    }
}
