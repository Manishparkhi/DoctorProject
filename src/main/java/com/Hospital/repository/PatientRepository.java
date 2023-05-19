package com.Hospital.repository;

import com.Hospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    @Query(value = "select * from tbl_patient where doctor_id = ?", nativeQuery = true)
    List<Patient> getAllPatientsOfDoctorById(Integer doctorId);
}
