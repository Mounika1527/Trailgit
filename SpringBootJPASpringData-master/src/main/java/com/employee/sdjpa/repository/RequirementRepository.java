package com.employee.sdjpa.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.transaction.annotation.Transactional;

import com.employee.sdjpa.models.Requirement;


@Transactional
public interface RequirementRepository extends CrudRepository<Requirement,Integer> {

	 public Requirement findByReqId(int reqId);
 
	 public List<Requirement> findAll();

}
