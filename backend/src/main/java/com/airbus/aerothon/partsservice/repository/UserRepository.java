package com.airbus.aerothon.partsservice.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.airbus.aerothon.partsservice.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	@Query(nativeQuery = true,value ="SELECT id,name,email,role from users where email = ?1 and password = ?2")
	Map<String,Object> findByEmailAndPassword(String email,String password);
}
