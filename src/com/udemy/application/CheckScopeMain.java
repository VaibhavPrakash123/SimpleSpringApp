package com.udemy.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheckScopeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get configuration XML file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		// retrieve Bean from container
		IronMan Tony = context.getBean("myHero", IronMan.class);
		IronMan Pepper = context.getBean("myHero", IronMan.class);
		CheckScope man1 = context.getBean("commonMan", CheckScope.class);
		CheckScope man2 = context.getBean("commonMan", CheckScope.class);

		// Check scopetype of Singleton And prototype:

		boolean result = Tony == Pepper;
		boolean result1 = man1 == man2;

		// print result

		System.out.println("Both beans(Tony and pepper) point to one object? " +result+ ".Hence the scope is Singleton. Memory location of the bean : "+Tony);
		System.out.println("Both beans(Man1 and Man2) point to different objects? " +result1+ ".Hence the scope is prototype. Memory location of both the objects : "+man1 +"" +man2);
		// close the Context

		context.close();

	}

}
