package com.dao;

import java.util.Collection;

import com.entity.Country;
import com.entity.Player;
import com.entity.Team;

public interface PlayerDAO {
	void addPlayer(Player player);
	void deletePlayer(Player player);
	Collection<Player> getAllPlayers();
	Collection<Player> getPlayersByName(String firstname, String surname);
	Collection<Player> getPlayersByPosition(String position);
	Collection<Player> getPlayersByTeam(Team team);
	Collection<Player> getPlayersBycountry(Country country);
	Collection<Player> getPlayer(Player player);
}
