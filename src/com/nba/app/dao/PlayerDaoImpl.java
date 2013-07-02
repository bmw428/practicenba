package com.nba.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nba.app.domain.Player;

@Repository
public class PlayerDaoImpl implements PlayerDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Player> getPlayers() {
		return sessionFactory.getCurrentSession().createQuery("from Player").list();
	}

}
