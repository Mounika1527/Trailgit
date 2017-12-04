/*package com.employee.sdjpa.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.employee.sdjpa.models.Employee;
import com.employee.sdjpa.models.Profile;
import com.employee.sdjpa.models.Requirement;

@Controller
public class RestfulClient {
	RestTemplate restTemplate;

	public RestfulClient() {
		restTemplate = new RestTemplate();
	}

	@RequestMapping(value="/profile",method = RequestMethod.GET)
	public String profile(@ModelAttribute Profile profile,Model model) {
		ResponseEntity<List> requirement = restTemplate.getForEntity("http://localhost:8186/require/allRequirements",
				List.class);
		List listRequire = requirement.getBody();
		  
		  if(!CollectionUtils.isEmpty(listRequire)){
		   model.addAttribute("requirement",listRequire);
		  }
		  
		return "profile";
	}

	*//**
	 * post entity
	 *//*
	@RequestMapping(value = "/templateInsert", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee profile,@ModelAttribute Requirement requirement, Model model) {
		String postUrl = "http://localhost:8186/recruitment/create";
		
		ResponseEntity<Employee> postResponse = restTemplate.postForEntity(postUrl, profile, Employee.class);
		
		model.addAttribute("postResponse", postResponse.getBody());
		
				return "postResponse";
	}

	*//**
	 * get entity
	 *//*
	@RequestMapping(value = "/templateRetreive", method = RequestMethod.GET)
	public String getEntity(Model model) {
		ResponseEntity<List> profiles = restTemplate.getForEntity("http://localhost:8186/recruitment/allProfiles",
				List.class);
		
		ResponseEntity<List> requirements = restTemplate.getForEntity("http://localhost:8186/require/allRequirements", List.class);
		  ResponseEntity<Requirement> response = restTemplate
					.getForEntity("http://localhost:8100/require/allRequirement?reqId=" + reqId, Requirement.class);
		List lstProfiles = profiles.getBody();
	List lstRequires=requirements.getBody();
		if (!CollectionUtils.isEmpty(lstProfiles)) {
			model.addAttribute("profilesLst", lstProfiles);
			model.addAttribute("requireLst",lstRequires);
		}
		return "profiles";
	}

	@RequestMapping(value = "/editTemplate/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") int id, Model model) {

		ResponseEntity<Profile> response = restTemplate
				.getForEntity("http://localhost:8186/recruitment/editProfile?id=" + id, Employee.class);

		model.addAttribute("profile", response.getBody());
		return "profileEdit";
	}

	@RequestMapping(value = "/templateUpdate", method = RequestMethod.POST)
	public String updateStudentInfo(@ModelAttribute Profile profile, Model model, Profile profiles) {
		ResponseEntity<List> response = restTemplate.postForEntity("http://localhost:8186/recruitment/update", profile,
				List.class);
		model.addAttribute("profilesLst", response.getBody());
		return "profiles";
	}

	*//**
	 * delete entity
	 *//*
	@RequestMapping("/templateDelete/{id}")
	public String deleteEntity(@PathVariable("id") int id) {
		String deleteUl = "http://localhost:8186/recruitment/delete?id=" + id;
		restTemplate.delete(deleteUl);
		return "deleteResponse";
	}
	
	@RequestMapping(value = "addStudentCourse/{studentId}", method = RequestMethod.GET)
    public String addCourse(@PathVariable("id") int id, Model model){
  
  ResponseEntity<List> RequirementList = restTemplate.getForEntity("http://localhost:8100/course/getCourses", List.class);
  ResponseEntity<Profile> profile = restTemplate.getForEntity("http://localhost:8100/recruitment/editProfile?id="+id,Profile.class);
  
  
  
  List listRequire = RequirementList.getBody();
  
  if(!CollectionUtils.isEmpty(listRequire)){
   model.addAttribute("requirement",listRequire);
  }
  model.addAttribute("profile", profile.getBody());
     return "addRequirement";
    }
}
*/