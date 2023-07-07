package com.cegeka.academy.bepatientshub4.repository;

import com.cegeka.academy.bepatientshub4.entity.PatientFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientFileRepository extends JpaRepository<PatientFile, Long> {
    List<PatientFile> findByRoom_Specialization_Id(Long specializationId);
}
