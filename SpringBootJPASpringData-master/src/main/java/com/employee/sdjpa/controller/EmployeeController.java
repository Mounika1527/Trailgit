
package com.employee.sdjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.employee.sdjpa.models.Employee;
import com.employee.sdjpa.repository.EmployeeRepository;




@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	

	
	@RequestMapping("/employees")
	public String index(Model model) {
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		model.addAttribute("employees", employees);
    	return "employees";
    }
	
	
	@RequestMapping(value="/create",method=RequestMethod.POST,consumes = {"application/json"}, produces = {"application/json"})
	public Employee create(@RequestBody Employee student) {
	 student = employeeRepository.save(student);
	    return student;
	}
	
	@RequestMapping(value="/editEmployee",method=RequestMethod.GET)
	public Employee edit(@RequestParam(value="employeeId") int employeeId)
	{
		Employee employee = employeeRepository.findByEmployeeId(employeeId);
		return employee;
		
	}
	
	
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public List<Employee> update(@RequestBody Employee employee) {
		Employee currentprofile = new Employee();
		currentprofile.setName(employee.getName());
		currentprofile.setEmailId(employee.getEmailId());
		currentprofile.setPassword(employee.getPassword());			
		currentprofile.setPhone(employee.getPhone());
     	currentprofile.setAddress(employee.getAddress());
		currentprofile.setEmployeeId(employee.getEmployeeId());
		employee = employeeRepository.save(currentprofile);
		return (List<Employee>)employeeRepository.findAll();
	}
	
	
	
	
	
	@RequestMapping(value="/allEmployees",method=RequestMethod.GET)
	 public @ResponseBody List<Employee> getEmployees() {
        return (List<Employee>)employeeRepository.findAll();
    } 
	
	
	
	

	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public void delete(@RequestParam(value="employeeId") int employeeId) {
		
		employeeRepository.deleteByEmployeeId(employeeId);
		

	}
}
