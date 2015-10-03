package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="managers")
public class Manager {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="country")
	private Country country;
	
	
	public Manager(){
		
	}
	
	public Manager(int id, String firstname, String surname,
			Country country) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Country getcountry() {
		return country;
	}

	public void setcountry(Country country) {
		this.country = country;
	}
	
}

	
