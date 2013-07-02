package com.nba.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.nba.app.service.PlayerService;

@Controller
public class PlayerController {
	
	@Autowired
	PlayerService playerService;

//	@RequestMapping(value="/players", method=RequestMethod.GET)
//	public @ResponseBody List<Player> getPlayers() {
//		return playerService.getPlayers();
//	}
	
	@RequestMapping(value="/players", method=RequestMethod.GET)
	public ModelAndView getPlayers() {
		return new ModelAndView("players", "players", playerService.getPlayers());
	}

}
