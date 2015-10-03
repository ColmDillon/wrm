package com.dao;

import java.util.Collection;

import com.entity.Manager;
import com.entity.Country;

public interface ManagerDAO {
	void addManager(Manager manager);
	void deleteManager(Manager manager);
	Collection<Manager> getAllManagers();
	Collection<Manager> getManager(Manager manager);
	Collection<Manager> getManagerByName(String firstname, String surname);
	Collection<Manager> getManagerBycountry(Country country);
}
