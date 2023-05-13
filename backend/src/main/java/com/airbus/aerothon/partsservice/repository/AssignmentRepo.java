package com.airbus.aerothon.partsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airbus.aerothon.partsservice.model.Assignment;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment, Long> {

}
