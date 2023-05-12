package com.airbus.aerothon.partsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airbus.aerothon.partsservice.model.Part;

@Repository
public interface PartsRepo extends JpaRepository<Part, Long> {

}
