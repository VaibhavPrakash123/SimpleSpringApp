package com.udemy.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Superhero hero = context.getBean("myHero", Superhero.class);
		Superhero villain = context.getBean("myVillain",Superhero.class);
		
		System.out.println(villain.doAction());
		System.out.println(villain.useMoney());
		
		context.close();
	}

}
