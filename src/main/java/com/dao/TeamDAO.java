package com.dao;

import java.util.Collection;

import com.entity.Country;
import com.entity.League;
import com.entity.Team;
import com.entity.User;

public interface TeamDAO {
	void addTeam(Team team);
	void deleteTeam(Team team);
	Collection<Team> getAllTeams();
	Collection<Team> getTeamsByLeague(League league);
	Collection<Team> getTeamByUser(User user);
	Collection<Team> getTeamByCountry(Country country);
}
