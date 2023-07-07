package com.cegeka.academy.bepatientshub4.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "patient_file")
public class PatientFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_insured")
    private boolean isInsured;

    @Column(name = "admission_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date admissionDate;

    @Column(name = "discharge_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dischargeDate;

    @Column(name = "initial_diagnosis")
    private String initialDiagnosis;

    @Column(name = "seventy_two_hour_diagnosis")
    private String seventyTwoHourDiagnosis;

    @Column(name = "final_diagnosis")
    private String finalDiagnosis;

    @Column(name = "medic_team")
    private String medicTeam;

    @Column(name = "surgery_details")
    private String surgeryDetails;

    @Column(name = "surgery_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date surgeryDate;

    @Column(name = "history_disease")
    private String historyDisease;

    @Column(name = "history_antecedents")
    private String historyAntecedents;

    @Column(name = "history_living_working_conditions")
    private String historyLivingWorkingConditions;

    @Column(name = "history_behaviors")
    private String historyBehaviors;

    @Column(name = "history_medication_before_hospitalization")
    private String historyMedicationBeforeHospitalization;

    @Column(name = "history_general_clinical_examination")
    private String historyGeneralClinicalExamination;


    @OneToMany(mappedBy = "patientFile", cascade = CascadeType.ALL)
    private List<EvolutionAndTreatment> evolutionAndTreatments;

    @OneToOne
    @JoinColumn(name = "insurance_type_id")
    private InsuranceType insuranceType;

    @OneToOne
    @JoinColumn(name =  "admission_type_id")
    private AdmissionType admisionType;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public PatientFile() {}

    public PatientFile(Long id, boolean isInsured, Date admissionDate, Date dischargeDate, String initialDiagnosis,
                       String seventyTwoHourDiagnosis, String finalDiagnosis, String medicTeam, String surgeryDetails,
                       Date surgeryDate, String historyDisease, String historyAntecedents, String historyLivingWorkingConditions,
                       String historyBehaviors, String historyMedicationBeforeHospitalization, String historyGeneralClinicalExamination,
                       List<EvolutionAndTreatment> evolutionAndTreatments, InsuranceType insuranceType, AdmissionType admisionType,
                       Room room, Patient patient) {
        this.id = id;
        this.isInsured = isInsured;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.initialDiagnosis = initialDiagnosis;
        this.seventyTwoHourDiagnosis = seventyTwoHourDiagnosis;
        this.finalDiagnosis = finalDiagnosis;
        this.medicTeam = medicTeam;
        this.surgeryDetails = surgeryDetails;
        this.surgeryDate = surgeryDate;
        this.historyDisease = historyDisease;
        this.historyAntecedents = historyAntecedents;
        this.historyLivingWorkingConditions = historyLivingWorkingConditions;
        this.historyBehaviors = historyBehaviors;
        this.historyMedicationBeforeHospitalization = historyMedicationBeforeHospitalization;
        this.historyGeneralClinicalExamination = historyGeneralClinicalExamination;
        this.evolutionAndTreatments = evolutionAndTreatments;
        this.insuranceType = insuranceType;
        this.admisionType = admisionType;
        this.room = room;
        this.patient = patient;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        this.isInsured = insured;
    }

    public String getHistoryDisease() {
        return historyDisease;
    }

    public void setHistoryDisease(String historyDisease) {
        this.historyDisease = historyDisease;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getInitialDiagnosis() {
        return initialDiagnosis;
    }

    public void setInitialDiagnosis(String initialDiagnosis) {
        this.initialDiagnosis = initialDiagnosis;
    }

    public String getSeventyTwoHourDiagnosis() {
        return seventyTwoHourDiagnosis;
    }

    public void setSeventyTwoHourDiagnosis(String seventyTwoHourDiagnosis) {
        this.seventyTwoHourDiagnosis = seventyTwoHourDiagnosis;
    }

    public String getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(String finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    public String getMedicTeam() {
        return medicTeam;
    }

    public void setMedicTeam(String medicTeam) {
        this.medicTeam = medicTeam;
    }

    public String getSurgeryDetails() {
        return surgeryDetails;
    }

    public void setSurgeryDetails(String surgeryDetails) {
        this.surgeryDetails = surgeryDetails;
    }

    public Date getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(Date surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public String getHistoryAntecedents() {
        return historyAntecedents;
    }

    public void setHistoryAntecedents(String historyAntecedents) {
        this.historyAntecedents = historyAntecedents;
    }

    public String getHistoryLivingWorkingConditions() {
        return historyLivingWorkingConditions;
    }

    public void setHistoryLivingWorkingConditions(String historyLivingWorkingConditions) {
        this.historyLivingWorkingConditions = historyLivingWorkingConditions;
    }

    public String getHistoryBehaviors() {
        return historyBehaviors;
    }

    public void setHistoryBehaviors(String historyBehaviors) {
        this.historyBehaviors = historyBehaviors;
    }

    public String getHistoryMedicationBeforeHospitalization() {
        return historyMedicationBeforeHospitalization;
    }

    public void setHistoryMedicationBeforeHospitalization(String historyMedicationBeforeHospitalization) {
        this.historyMedicationBeforeHospitalization = historyMedicationBeforeHospitalization;
    }

    public String getHistoryGeneralClinicalExamination() {
        return historyGeneralClinicalExamination;
    }

    public void setHistoryGeneralClinicalExamination(String historyGeneralClinicalExamination) {
        this.historyGeneralClinicalExamination = historyGeneralClinicalExamination;
    }

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    public List<EvolutionAndTreatment> getEvolutionAndTreatments() {
        return evolutionAndTreatments;
    }

    public void setEvolutionAndTreatments(List<EvolutionAndTreatment> evolutionAndTreatments) {
        this.evolutionAndTreatments = evolutionAndTreatments;
    }

    public AdmissionType getAdmisionType() {
        return admisionType;
    }

    public void setAdmisionType(AdmissionType admisionType) {
        this.admisionType = admisionType;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "PatientFile{" +
                "id=" + id +
                ", isInsured=" + isInsured +
                ", admissionDate=" + admissionDate +
                ", dischargeDate=" + dischargeDate +
                ", initialDiagnosis='" + initialDiagnosis + '\'' +
                ", seventyTwoHourDiagnosis='" + seventyTwoHourDiagnosis + '\'' +
                ", finalDiagnosis='" + finalDiagnosis + '\'' +
                ", medicTeam='" + medicTeam + '\'' +
                ", surgeryDetails='" + surgeryDetails + '\'' +
                ", surgeryDate=" + surgeryDate +
                ", historyDisease='" + historyDisease + '\'' +
                ", historyAntecedents='" + historyAntecedents + '\'' +
                ", historyLivingWorkingConditions='" + historyLivingWorkingConditions + '\'' +
                ", historyBehaviors='" + historyBehaviors + '\'' +
                ", historyMedicationBeforeHospitalization='" + historyMedicationBeforeHospitalization + '\'' +
                ", historyGeneralClinicalExamination='" + historyGeneralClinicalExamination + '\'' +
                ", evolutionAndTreatments=" + evolutionAndTreatments +
                ", insuranceType=" + insuranceType +
                ", admisionType=" + admisionType +
                ", room=" + room +
//                ",  patient=" + patient+
                '}';
    }
}
