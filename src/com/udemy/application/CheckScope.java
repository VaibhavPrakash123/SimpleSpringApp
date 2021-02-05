package com.udemy.application;

public class CheckScope implements Superhero {
	private onWhat what1;
	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return "I am just a common man";
		
	}

	@Override
	public String useMoney() {
		// TODO Auto-generated method stub
		return "Spend Rs 10 on tomatoes :)";
	}
	
	public CheckScope(onWhat what1) {
		this.what1 = what1;
	}

}
