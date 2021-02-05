package com.udemy.application;

public class IronMan implements Superhero {
	private onWhat what1;

	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return "Fire Missiles at Enemy";
	}

	public IronMan(onWhat what1) {
		super();
		this.what1 = what1;
	}

	@Override
	public String useMoney()
	{
		return what1.useMoney();
	}
}
