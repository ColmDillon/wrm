package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nations")
public class Country {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="country")
	private String country;
	
	public Country(){
		
	}
	
	public Country(int id, String country) {
		super();
		this.id = id;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNation() {
		return country;
	}

	public void setNation(String country) {
		this.country = country;
	}
	
	
	
}
