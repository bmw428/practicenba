package com.nba.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.app.dao.PlayerDao;
import com.nba.app.domain.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	PlayerDao playerDao;

	@Override
	public List<Player> getPlayers() {
		return playerDao.getPlayers();
	}

}
