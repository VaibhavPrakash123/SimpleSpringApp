package com.udemy.application;

public class Ultron implements Superhero {

	private Money money;
	 
	//no-args constructor
	public Ultron() {System.out.println("Ultron Created - Creator : Tony Stark");}
	public void setMoney(Money money) {
		this.money = money;
		System.out.println("Inside setter dependency injection");
	}

	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		
		return "Drop Asteroid on Earth";
	}

	@Override
	public String useMoney() {
		// TODO Auto-generated method stub
		return null;
	}

}
