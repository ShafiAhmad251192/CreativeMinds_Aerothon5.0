package com.airbus.aerothon.partsservice.service;

import java.util.List;
import java.util.Map;

import com.airbus.aerothon.partsservice.model.Part;
import com.airbus.aerothon.partsservice.util.Filter;

public interface PartsService {

	
	Part getPartById(Long id);
	List<Part> getUsersByFilters(List<Filter> filters);
	String assignPart(Long userId,Long PartId);
}
