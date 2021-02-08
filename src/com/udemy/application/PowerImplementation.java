package com.udemy.application;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PowerImplementation implements Power {

	Random myRandom = new Random();
	
	@Override
	public int producePower() {
		// TODO Auto-generated method stub
		int Power = myRandom.nextInt(360);
		return Power;
	}

}
