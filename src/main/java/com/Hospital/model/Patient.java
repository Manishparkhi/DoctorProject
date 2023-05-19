package com.Hospital.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Integer patientId;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "patient_disease")
    private String patientDisease;
    @Column(name = "admit_date_time")
    private LocalDateTime myObj = LocalDateTime.now();
    @JoinColumn(name = "doctor_id")
    @ManyToOne
    private Doctor doctor;


}
