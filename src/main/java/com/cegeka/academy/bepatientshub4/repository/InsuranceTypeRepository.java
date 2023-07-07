package com.cegeka.academy.bepatientshub4.repository;

import com.cegeka.academy.bepatientshub4.entity.InsuranceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InsuranceTypeRepository extends JpaRepository<InsuranceType, Long> {
    Optional<InsuranceType> findByInsuranceType(String insuranceType);
}
