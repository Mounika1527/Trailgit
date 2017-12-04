package com.employee.sdjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.sdjpa.models.Requirement;
import com.employee.sdjpa.repository.RequirementRepository;

@RestController
@RequestMapping("/requirement")
public class RequirementController {

	@Autowired
	RequirementRepository requirementRepository;

	@RequestMapping(value = "/getRequirements", method = RequestMethod.GET)
	public @ResponseBody List<Requirement> getRequirements() {
		return (List<Requirement>) requirementRepository.findAll();
	}

	@RequestMapping(value = "/getRequirement", method = RequestMethod.GET)
	public Requirement getRequirement(@RequestParam(value = "reqId") int reqId) {
		Requirement requirement = requirementRepository.findByReqId(reqId);
		return requirement;
	}
}
