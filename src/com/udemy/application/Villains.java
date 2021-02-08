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
public class Villains implements Fighters {
	// Read text file containing Villain Names
	File villain = new File("D:/SpringProjectsWorkspace/SpringApp/src/com/udemy/application/villain.txt");
	// List to add Villains
	List<String> villains;
	BufferedReader br;

	// Generate random numbers

	// Inject dependencies
	@Autowired

	PowerImplementation pwr;

	// noargs constructor
	public Villains() {
		System.out.println("Villain Gene Inherited, villain Created");
	}

	public Villains(PowerImplementation pwr) {
		this.pwr = pwr;
	}
	// Injecting Dependencies

	@Override
	public int powerInput() {
		// TODO Auto-generated method stub

		return pwr.producePower();
	}

	@Override
	public String chooseFighter() {
		// TODO Auto-generated method stub
		villains = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(villain));
			String content = br.readLine();
			while (content != null) {
				content = br.readLine();
				villains.add(content);
			}
			Random myRandom = new Random();
			int index = myRandom.nextInt(villains.size() - 1);
			String fighter = villains.get(index);
			return (fighter);
		}

		catch (IOException ie) {
			ie.printStackTrace();
		}
		return null;
	}

}
