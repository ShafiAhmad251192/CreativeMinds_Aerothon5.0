package com.airbus.aerothon.partsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.airbus.aerothon.partsservice.model.Part;

import jakarta.transaction.Transactional;

@Repository
public interface PartsRepo extends JpaRepository<Part, Long> {

	@Transactional
	@Modifying
	@Query(nativeQuery=true,value="UPDATE part set is_recycled = true where id=?1")
	void updateStatus(Long partId);
}
