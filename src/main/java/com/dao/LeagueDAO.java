package com.dao;

import java.util.Collection;

import com.entity.League;
import com.entity.Manager;
import com.entity.Country;
import com.entity.Player;
import com.entity.Team;

public interface LeagueDAO {
	void addLeague(League league);
	void deleteLeague(League league);
	Collection<League> getLeague(League league);
	Collection<League> getLeagueByTeam(Team team);
	Collection<League> getLeagueByPlayer(Player player);
	Collection<League> getLeagueByManager(Manager manager);
	Collection<League> getLeagueByCountry(Country country);
	Collection<League> getLeagueByName(String name);
}
