package com.udemy.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Avengers implements Fighters {

	@Autowired

	PowerImplementation pwr;
	
	//noargs constructor
	public Avengers()
	{
		System.out.println("Avenger Summoned from H.Q");
	}
	
	public Avengers(PowerImplementation pwr)
	{
		this.pwr = pwr;
	}
	
	
	
	@Override
	public int powerInput() {
		// TODO Auto-generated method stub
		return pwr.producePower();
		
	}

	@Override
	public String chooseFighter() {
		// TODO Auto-generated method stub
		File file = new File("D:/SpringProjectsWorkspace/SpringApp/src/com/udemy/application/heroes.txt");
		List<String> heroes;
		Random random = new Random();
		BufferedReader br;
		try {
			heroes = new ArrayList<String>();
			br = new BufferedReader(new FileReader(file));
			String content = br.readLine();
			while (content != null) {
				heroes.add(content);
				content = br.readLine();
			}
			int index = random.nextInt(heroes.size());
			String hero = heroes.get(index);
			return hero;
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		return null;

	}

}
