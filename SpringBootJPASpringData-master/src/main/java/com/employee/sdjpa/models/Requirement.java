package com.employee.sdjpa.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "Requirement")
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
public class Requirement implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	int reqId;

	@Column(name = "technology", nullable = false)
	String technology;

	
	

	public int getReqId() {
		return reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	
	

}
