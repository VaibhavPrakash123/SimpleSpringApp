package com.udemy.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myHero")
public class IronMan implements Superhero {
	
	@Autowired
	@Qualifier("avengers")
	Allies ally;
	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return "Fire Missiles at Enemy";
	}

	@Override
	public String useMoney() {
		// TODO Auto-generated method stub
		return "Money to do Stark Expo";
	}

	@Override
	public String callAllies() {
		// TODO Auto-generated method stub
		String allies = ally.getAllies();
		return allies;
	}

	}
