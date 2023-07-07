package com.cegeka.academy.bepatientshub4.dto;

import com.cegeka.academy.bepatientshub4.entity.PatientFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientDTO {
    private String firstName;

    private String lastName;

    private String gender;

    private Date birthDate;

    private String address;

    private Long cnp;

    private String serial;

    private int number;

    private List<PatientFile> patientFiles;

    public PatientDTO () {}

    public PatientDTO(String firstName, String lastName, String gender, Date birthDate, String address, Long cnp,
                      String serial, int number, List<PatientFile> patientFiles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.cnp = cnp;
        this.serial = serial;
        this.number = number;
        this.patientFiles = patientFiles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCnp() {
        return cnp;
    }

    public void setCnp(Long cnp) {
        this.cnp = cnp;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<PatientFile> getPacientFiles() {
        return patientFiles;
    }

    public void setPacientFiles(List<PatientFile> patientFiles) {
        this.patientFiles = patientFiles;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", cnp=" + cnp +
                ", serial='" + serial + '\'' +
                ", number=" + number +
                ", patientFiles=" + patientFiles +
                '}';
    }
}
