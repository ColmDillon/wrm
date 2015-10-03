package com.jpa;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.dao.UserDAO;
import com.entity.User;

@Stateless
@Local
public class UserDaoImpl implements UserDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void addUser(User user) {
		Query q = em.createQuery("From com.entity.User");
		List<User> users = q.getResultList();
		if(!users.contains(user)){
			em.persist(user);
		}

	}

	@Override
	public void deleteUser(User user) {
		Query q = em.createQuery("From com.entity.User");
		List<User> users = q.getResultList();
		if(users.contains(user)){
			em.remove(user);
		}

	}

	@Override
	public Collection<User> getAllUsers() {
		Query q = em.createQuery("From com.entity.User");
		List<User> users =  q.getResultList();
		return users;
	}

	@Override
	public Collection<User> getUserByUsernameAndPassword(String username,
			String password) {
		Query q = em.createQuery("Select u from User u where u.uername = :username AND u.password = :password");
		q.setParameter("username", username);
		q.setParameter("password", password);
		List<User> user = q.getResultList();
		return user;
	}

	@Override
	public User getUserByName(String name) {
		Query q  = em.createQuery("Select u from User.u where u.username = :username");
		q.setParameter("username",name);
		Collection<User> user = q.getResultList();
		for(User u: user){
			if(u.getUsername().equals(name)){
				return u;
			}
		}
		return null;
	}

}
