package com.udemy.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Avengers implements Allies {
	List<String> hero1 = new ArrayList<String>();

	private Random random = new Random();
	
	@Override
	public String getAllies() {
		BufferedReader br = null;
		List<String> Hero = new ArrayList<String>();
		try {
			File File1 = new File("D:/SpringProjectsWorkspace/SpringApp/src/com/udemy/application/Hero.txt");
			br = new BufferedReader(new FileReader(File1));
			String contentLine = br.readLine();
			while (contentLine != null) {
				contentLine = br.readLine();
			
				Hero.add(contentLine);
				

				

			}

		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		int index = random.nextInt(Hero.size()-1);
		String hero = Hero.get(index);
		return(hero);
		
		
		
	}


//	public String getAllies() {
//		// TODO Auto-generated method stub
//		System.out.println(Hero1.size());
//		int index = random.nextInt(Hero1.size());
//		String hero = Hero1.get(index);
//		return hero;
//	}
}
