package com.udemy.application;

import org.springframework.stereotype.Component;

@Component("myHero")
public class IronMan implements Superhero {
	

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

	}
