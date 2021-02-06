package com.udemy.application;

import org.springframework.stereotype.Component;

@Component
public class spendMoney implements Money {

	@Override
	public String useMoney() {
		// TODO Auto-generated method stub
		return " build Vibranium Suit";
	}

}
