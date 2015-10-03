package com.dao;

import java.util.Collection;

import com.entity.Nationality;
import com.entity.Player;
import com.entity.Team;

public interface PlayerDAO {
	void addPlayer();
	void deletePlayer();
	Collection<Player> getAllPlayers();
	Collection<Player> getPlayersByName(String firstname, String surname);
	Collection<Player> getPlayersByPosition(String position);
	Collection<Player> getPlayersByTeam(Team team);
	Collection<Player> getPlayersByNationality(Nationality nationality);
	Collection<Player> getPlayerById(int id);
}
