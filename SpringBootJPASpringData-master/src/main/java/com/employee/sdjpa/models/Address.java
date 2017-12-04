package com.employee.sdjpa.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// @Embeddable tells Hibernate that Address object 
// will be embedded into some other tables.
// The values of the properties will be populated
// into a table in which we want to embed the Address
@Embeddable
public class Address {
	@Column(name = "street")
	private String street;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zipcode")
	private String zipcode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
