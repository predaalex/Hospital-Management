package com.cegeka.academy.bepatientshub4.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "insurance_type")
public class InsuranceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "insurance_type", length = 256)
    private String insuranceType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insurence_type) {
        this.insuranceType = insurence_type;
    }

    @Override
    public String toString() {
        return "InsuranceType{" +
                "id=" + id +
                ", insuranceType='" + insuranceType + '\'' +
                '}';
    }
}
