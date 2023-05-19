package com.Hospital.service;

import com.Hospital.model.Patient;
import com.Hospital.repository.PatientRepository;
import com.Hospital.repository.DoctorRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository repository;

    @Autowired
    DoctorRepository doctorRepository;
    public Patient savePatient(Patient patient) {
        Integer doctorId = patient.getDoctor().getDoctorId();
        if(doctorRepository.existsById(doctorId)){
            return repository.save(patient);
        }else return null;
    }

    public JSONArray getPatient(Integer patientId) {
        JSONArray response = new JSONArray();
        if(patientId == null){
            List<Patient> list = repository.findAll();
            for (Patient patient : list){
                response.put(new JSONObject(patient));
            }
        }else {
            if(repository.findById(patientId).isPresent()){
                Patient patient = repository.findById(patientId).get();
                response.put(new JSONObject(patient));
            }
        }
        return response;
    }
    public String updatePatient(Integer patientId, Patient newPatient) {
        String response = "";
        if (repository.findById(patientId).isPresent()) {
            Patient oldPatient = repository.findById(patientId).get();
            if(newPatient.getPatientName() != null) oldPatient.setPatientName(newPatient.getPatientName());
            if(newPatient.getPatientDisease() != null) oldPatient.setPatientDisease(newPatient.getPatientDisease());
            if(newPatient.getDoctor() != null) {
                if(doctorRepository.findById(newPatient.getDoctor().getDoctorId()).isPresent()){
                    oldPatient.setDoctor(newPatient.getDoctor());
                }else return null;
            }
            repository.save(oldPatient);
            response = oldPatient.getPatientName();
        }
        return response;
    }
    public String deletePatient(Integer patientId) {
        String response = "";
        if (repository.findById(patientId).isPresent()) {
            response = repository.findById(patientId).get().getPatientName();
            repository.deleteById(patientId);
        }
        return response;
    }
}
