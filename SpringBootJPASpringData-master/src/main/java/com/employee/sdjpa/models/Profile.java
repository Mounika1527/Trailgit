
package com.employee.sdjpa.models;

import java.io.Serializable;
import java.util.*;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;









@Entity
@Table(name = "Employee_profile")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Profile implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="seq")
	@Column(name="employee_id")
	int employeeId;
	

	@Column(name = "name", nullable = false)
	String name;

	@Column(name = "emailId")
	String emailId;
	@Column(name = "password")
	String password;
	

	@Column(name = "phone", nullable = false)
	String phone;
	
	@Column(name = "experience", nullable = false)
	String experience;

	@Embedded
	private Address address;
	
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "employee_requirement", joinColumns = { @JoinColumn(name = "employeeId") },
	inverseJoinColumns = { @JoinColumn(name = "reqId") })
	private Set<Requirement> requirements = new HashSet<Requirement>(0);

	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	
	public Set<Requirement> getRequirements() {
		return requirements;
	}

	public void setRequirements(Set<Requirement> requirements) {
		this.requirements = requirements;
	}

	public boolean hasCourse(Requirement requirements) {
		for (Requirement employeeRequirement : getRequirements()) {
			if (employeeRequirement.getReqId() == requirements.getReqId()) {
				return true;
			}
		}
		return false;
	}	

}