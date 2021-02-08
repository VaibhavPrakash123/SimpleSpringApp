package com.udemy.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MatchMaking {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.Xml");
		Fighters villain = context.getBean("villains",Fighters.class);
		Fighters hero = context.getBean("avengers",Fighters.class);
		
		String fighter1 = villain.chooseFighter();
		String fighter2 = hero.chooseFighter();
		int power1 = villain.powerInput();
		int power2 = hero.powerInput();
		String winner;
		
		//Match Making
		System.out.println("The match has been scheduled between : " + fighter1 + " and "+ fighter2);
		System.out.println("Let's see who wins");
		System.out.println("The power produced by "+fighter1+" is "+power1 + " and power produced by "+fighter2+" is "+ power2);
		if(power1>power2)
		{
			winner = fighter1;
		}
		else {
			winner = fighter2;
		}
		System.out.println("The winner of the match is "+winner);
		
		context.close();
		
	}

}
