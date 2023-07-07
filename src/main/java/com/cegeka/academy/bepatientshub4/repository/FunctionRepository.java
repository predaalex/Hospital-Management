package com.cegeka.academy.bepatientshub4.repository;

import com.cegeka.academy.bepatientshub4.entity.Function;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionRepository extends JpaRepository<Function, Long> {

}