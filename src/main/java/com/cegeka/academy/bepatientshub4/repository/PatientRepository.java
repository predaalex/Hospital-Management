package com.cegeka.academy.bepatientshub4.repository;

import com.cegeka.academy.bepatientshub4.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByCnp(Long cnp);
}
