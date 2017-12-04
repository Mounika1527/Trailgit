package com.employee.sdjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.sdjpa.models.Employee;


@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Employee findByEmployeeId(int employeeId);

	public int deleteByEmployeeId(int employeeId);

}
