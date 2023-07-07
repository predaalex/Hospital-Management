package com.cegeka.academy.bepatientshub4.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.concurrent.TimeoutException;

@Entity
@Table(name = "evolution_and_treatment")
public class EvolutionAndTreatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "details")
    private String details;

    @Column(name = "start_date")
    private Timestamp start_date;

    @Column(name = "end_date")
    private TimeoutException end_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_file_id")
    @JsonIgnore
    private PatientFile patientFile;

    public EvolutionAndTreatment() {
    }

    public EvolutionAndTreatment(Long id, String details, Timestamp start_date, TimeoutException end_date, PatientFile patientFile) {
        this.id = id;
        this.details = details;
        this.start_date = start_date;
        this.end_date = end_date;
        this.patientFile = patientFile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }

    public TimeoutException getEnd_date() {
        return end_date;
    }

    public void setEnd_date(TimeoutException end_date) {
        this.end_date = end_date;
    }

    public PatientFile getPatientFile() {
        return patientFile;
    }

    public void setPatientFile(PatientFile patientFile) {
        this.patientFile = patientFile;
    }

    @Override
    public String toString() {
        return "EvolutionAndTreatment{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", patientFile=" + patientFile +
                '}';
    }
}

