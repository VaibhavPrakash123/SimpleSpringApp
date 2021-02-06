package com.udemy.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myVillain")
public class Ultron implements Superhero {

	private Money m1;

	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		
		return "Drop Asteroid on Earth";
	}
	@Autowired
	public Ultron(Money money)
	{
		m1 = money;
	}
	@Override
	public String useMoney() {
		// TODO Auto-generated method stub
		return "I am using Money to "+m1.useMoney();
	}

	
}
