package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stats")
public class PlayerStats {
	
	@Id
	@Column(name="player")
	private Player player;
	
	@Column(name="strength")
	private int strength;
	
	@Column(name="speed")
	private int speed;
	
	@Column(name="handling")
	private int handling;
	
	@Column(name="passing")
	private int passing;
	
	@Column(name="tackling")
	private int tackling;
	
	@Column(name="positioning")
	private int positioning;
	
	@Column(name="leadership")
	private int leadership;
	
	@Column(name="weight")
	private int weight; // kg
	
	@Column(name="height")
	private int height; // cms
	
	@Column(name="stamina")
	private int stamina;

	public PlayerStats(Player player, int strength, int speed, int handling,
			int passing, int tackling, int positioning, int leadership,
			int weight, int height, int stamina) {
		super();
		this.player = player;
		this.strength = strength;
		this.speed = speed;
		this.handling = handling;
		this.passing = passing;
		this.tackling = tackling;
		this.positioning = positioning;
		this.leadership = leadership;
		this.weight = weight;
		this.height = height;
		this.stamina = stamina;
	}
	
	public PlayerStats(){
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHandling() {
		return handling;
	}

	public void setHandling(int handling) {
		this.handling = handling;
	}

	public int getPassing() {
		return passing;
	}

	public void setPassing(int passing) {
		this.passing = passing;
	}

	public int getTackling() {
		return tackling;
	}

	public void setTackling(int tackling) {
		this.tackling = tackling;
	}

	public int getPositioning() {
		return positioning;
	}

	public void setPositioning(int positioning) {
		this.positioning = positioning;
	}

	public int getLeadership() {
		return leadership;
	}

	public void setLeadership(int leadership) {
		this.leadership = leadership;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + handling;
		result = prime * result + height;
		result = prime * result + leadership;
		result = prime * result + passing;
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + positioning;
		result = prime * result + speed;
		result = prime * result + stamina;
		result = prime * result + strength;
		result = prime * result + tackling;
		result = prime * result + weight;
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
		PlayerStats other = (PlayerStats) obj;
		if (handling != other.handling)
			return false;
		if (height != other.height)
			return false;
		if (leadership != other.leadership)
			return false;
		if (passing != other.passing)
			return false;
		if (player == null) {
			if (other.player != null)
				return false;
		} else if (!player.equals(other.player))
			return false;
		if (positioning != other.positioning)
			return false;
		if (speed != other.speed)
			return false;
		if (stamina != other.stamina)
			return false;
		if (strength != other.strength)
			return false;
		if (tackling != other.tackling)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
}
