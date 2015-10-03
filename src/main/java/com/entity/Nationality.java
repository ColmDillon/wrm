package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nations")
public class Nationality {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nations")
	private String nation;
	
	public Nationality(){
		
	}
	
	public Nationality(int id, String nation) {
		super();
		this.id = id;
		this.nation = nation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
	
}
