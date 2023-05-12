package com.airbus.aerothon.partsservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbus.aerothon.partsservice.model.Part;
import com.airbus.aerothon.partsservice.repository.PartsRepo;
import com.airbus.aerothon.partsservice.util.Filter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public class PartsServiceImpl implements PartsService {

	@Autowired
	PartsRepo partsRepo;
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Part getPartById(Long id) {
		// TODO Auto-generated method stub
		Part part = partsRepo.getById(id);
		return part;
	}
	
	public List<Part> getUsersByFilters(List<Filter> filters) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Part> query = builder.createQuery(Part.class);
        Root<Part> root = query.from(Part.class);

        Predicate predicate = builder.conjunction();
        for (Filter filter : filters) {
            Path<Comparable> field = root.get(filter.getField());
            switch (filter.getOperator()) {
                case EQUALS:
                    predicate = builder.and(predicate, builder.equal(field, filter.getValue()));
                    break;
                case GREATER_THAN:
                    predicate = builder.and(predicate, builder.greaterThan(field, (Comparable) filter.getValue()));
                    break;
                case LESS_THAN:
                    predicate = builder.and(predicate, builder.lessThan(field, (Comparable) filter.getValue()));
                    break;
                case IN:
                	predicate = builder.and(predicate,field.in((List<String>) filter.getValue()));
                	break;
            }
        }

        query.where(predicate);
        return entityManager.createQuery(query).getResultList();
    }
}
