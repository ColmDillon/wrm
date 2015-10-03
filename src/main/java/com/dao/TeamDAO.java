package com.dao;

import java.util.Collection;

import com.entity.League;
import com.entity.Team;
import com.entity.User;

public interface TeamDAO {
	void addTeam(Team team);
	void deleteTeam(Team team);
	Collection<Team> getAllTeams();
	Collection<Team> getTeamsByLeague(League league);
	Collection<Team> getTeamByUser(User user);
}
