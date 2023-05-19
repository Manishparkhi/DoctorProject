package com.Hospital.service;

import com.Hospital.model.Doctor;
import com.Hospital.model.Patient;
import com.Hospital.repository.DoctorRepository;
import com.Hospital.repository.PatientRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;

    @Autowired
    PatientRepository patientRepository;
    public Doctor saveDoctor(Doctor doctor) {
        return repository.save(doctor);
    }

    public JSONArray getDoctor(Integer doctorId) {
        JSONArray response = new JSONArray();
        if(doctorId == null){
            List<Doctor> list = repository.findAll();
            for (Doctor doctor : list){
                response.put(new JSONObject(doctor));
            }
        }else {
            if(repository.findById(doctorId).isPresent()){
                Doctor doctor = repository.findById(doctorId).get();
                response.put(new JSONObject(doctor));
            }
        }
        return response;
    }

    public String updateDoctor(Integer doctorId, Doctor newDoctor) {
        String response = "";
        if(repository.findById(doctorId).isPresent()){
            Doctor OldDoctor = repository.findById(doctorId).get();
            if(newDoctor.getDoctorName() != null) OldDoctor.setDoctorName(newDoctor.getDoctorName());
            if(newDoctor.getDoctorSpeciality() != null) OldDoctor.setDoctorSpeciality(newDoctor.getDoctorSpeciality());
            if(newDoctor.getYearOfExperience() != null) OldDoctor.setYearOfExperience(newDoctor.getYearOfExperience());
            repository.save(OldDoctor);
            response = OldDoctor.getDoctorName();
        }
        return response;
    }

    public String deleteDoctor(Integer doctorId) {
        String response = "";
        if(repository.findById(doctorId).isPresent()){
            Doctor doctor = repository.findById(doctorId).get();
            this.deleteAllPatients(doctorId);
            response = doctor.getDoctorName();
            repository.deleteById(doctorId);
        }
        return response;
    }

    private void deleteAllPatients(Integer doctorId) {
        List<Patient> patients = patientRepository.getAllPatientsOfDoctorById(doctorId);
        for(Patient patient : patients) patientRepository.delete(patient);
    }
}
