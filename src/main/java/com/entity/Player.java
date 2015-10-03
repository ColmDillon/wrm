package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player implements Serializable {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="position")
	private String position;
	
	@Column(name="team")
	private Team team;
	
	@Column(name="nationality")
	private Nationality nationality;
	
	private PlayerStats stats;
	
	public Player(){
		
	}

	public Player(int id, String firstname, String surname, String position,
			Team team, Nationality nationality, PlayerStats stats) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.position = position;
		this.team = team;
		this.nationality = nationality;
		this.stats = stats;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	
	public PlayerStats getStats(){
		return stats;
	}
	
	public void setStats(PlayerStats stats){
		this.stats = stats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
