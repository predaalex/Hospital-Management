package com.cegeka.academy.bepatientshub4.dto;

import com.cegeka.academy.bepatientshub4.entity.*;

import java.util.Date;
import java.util.List;

public class PatientFileDTO {

    private boolean isInsured;

    private Date admissionDate;

    private Date dischargeDate;

    private String initialDiagnosis;

    private String seventyTwoHourDiagnosis;

    private String finalDiagnosis;

    private String medicTeam;

    private String surgeryDetails;

    private Date surgeryDate;

    private String historyAntecedents;

    private String historyLivingWorkingConditions;

    private String historyBehaviors;

    private String historyMedicationBeforeHospitalization;

    private String historyGeneralClinicalExamination;

    private String historyDisease;

    private List<EvolutionAndTreatment> EvolutionAndTreatments;

    private InsuranceType insuranceType;


    private AdmissionType admisionType;

    private Room room;

    private Patient patient;

    public PatientFileDTO() {
    }

    public PatientFileDTO(boolean isInsured, Date admissionDate, Date dischargeDate, String initialDiagnosis,
                          String seventyTwoHourDiagnosis, String finalDiagnosis, String medicTeam, String surgeryDetails,
                          Date surgeryDate, String historyAntecedents, String historyLivingWorkingConditions, String historyBehaviors,
                          String historyMedicationBeforeHospitalization, String historyGeneralClinicalExamination, String historyDisease,
                          List<EvolutionAndTreatment> evolutionAndTreatments, InsuranceType insuranceType, AdmissionType admisionType,
                          Room room, Patient patient) {
        this.isInsured = isInsured;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.initialDiagnosis = initialDiagnosis;
        this.seventyTwoHourDiagnosis = seventyTwoHourDiagnosis;
        this.finalDiagnosis = finalDiagnosis;
        this.medicTeam = medicTeam;
        this.surgeryDetails = surgeryDetails;
        this.surgeryDate = surgeryDate;
        this.historyAntecedents = historyAntecedents;
        this.historyLivingWorkingConditions = historyLivingWorkingConditions;
        this.historyBehaviors = historyBehaviors;
        this.historyMedicationBeforeHospitalization = historyMedicationBeforeHospitalization;
        this.historyGeneralClinicalExamination = historyGeneralClinicalExamination;
        this.historyDisease = historyDisease;
        EvolutionAndTreatments = evolutionAndTreatments;
        this.insuranceType = insuranceType;
        this.admisionType = admisionType;
        this.room = room;
        this.patient = patient;
    }

    public boolean getIsInsured() {
        return isInsured;
    }

    public void setIsInsured(boolean insured) {
        this.isInsured = insured;
    }

    public String getHistoryDisease() {
        return historyDisease;
    }

    public void setHistoryDisease(String historyDisease) {
        this.historyDisease = historyDisease;
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

    public Date getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(Date surgeryDate) {
        this.surgeryDate = surgeryDate;
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
        return EvolutionAndTreatments;
    }

    public void setEvolutionAndTreatments(List<EvolutionAndTreatment> evolutionAndTreatments) {
        EvolutionAndTreatments = evolutionAndTreatments;
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
        return "PatientFileDTO{" +
                "isInsured=" + isInsured +
                ", admissionDate=" + admissionDate +
                ", dischargeDate=" + dischargeDate +
                ", initialDiagnosis='" + initialDiagnosis + '\'' +
                ", seventyTwoHourDiagnosis='" + seventyTwoHourDiagnosis + '\'' +
                ", finalDiagnosis='" + finalDiagnosis + '\'' +
                ", medicTeam='" + medicTeam + '\'' +
                ", surgeryDetails='" + surgeryDetails + '\'' +
                ", surgeryDate=" + surgeryDate +
                ", historyAntecedents='" + historyAntecedents + '\'' +
                ", historyLivingWorkingConditions='" + historyLivingWorkingConditions + '\'' +
                ", historyBehaviors='" + historyBehaviors + '\'' +
                ", historyMedicationBeforeHospitalization='" + historyMedicationBeforeHospitalization + '\'' +
                ", historyGeneralClinicalExamination='" + historyGeneralClinicalExamination + '\'' +
                ", historyDisease='" + historyDisease + '\'' +
                ", EvolutionAndTreatments=" + EvolutionAndTreatments +
                ", insuranceType=" + insuranceType +
                ", admisionType=" + admisionType +
                ", room=" + room +
                ", patient=" + patient +
                '}';
    }
}
