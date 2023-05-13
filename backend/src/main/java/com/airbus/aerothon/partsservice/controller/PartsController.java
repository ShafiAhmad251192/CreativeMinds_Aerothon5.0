package com.airbus.aerothon.partsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airbus.aerothon.partsservice.service.PartsService;
import com.airbus.aerothon.partsservice.util.Filter;

@RestController
@RequestMapping("/parts")
public class PartsController {

	@Autowired
	PartsService partService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getPart(@PathVariable Long id){
		return new ResponseEntity<>(partService.getPartById(id),HttpStatus.OK);
	}
	
	@PostMapping("/filtered")
	public ResponseEntity<?> getPartsByFilters(@RequestBody List<Filter> filters){
		
		return  new ResponseEntity<>(partService.getUsersByFilters(filters),HttpStatus.OK);
	}
	
	@PutMapping("/assign/{partId}/{userId}")
	public ResponseEntity<?> assign(@PathVariable Long partId, @PathVariable Long userId){
			
			return  new ResponseEntity<>(partService.assignPart(partId,userId),HttpStatus.OK);
		}
}
