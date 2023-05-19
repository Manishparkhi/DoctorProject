package com.Hospital.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Integer doctorId;
    @Column(name = "doctor_name")
    private String doctorName;
    @Column(name = "doctor_speciality")
    private String doctorSpeciality;
    @Column(name = "year_of_experience")
    private Integer yearOfExperience;

//    @JoinColumn(name = "patient_id")
//    @OneToMany(mappedBy = "tbl_doctor")
//    private Patient patient;

}
