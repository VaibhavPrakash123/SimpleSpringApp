package com.udemy.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class setterInjectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Superhero hero = context.getBean("myVillain", Superhero.class);
		System.out.println(hero.doAction());

		context.close();

}
}
