package com.udemy.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Villains implements Allies {
	List<String> villain = new ArrayList<String>();
	private Random random = new Random();
	@Override
	public String getAllies() {
		// TODO Auto-generated method stub
		BufferedReader br;
		File file1 = new File("D:/SpringProjectsWorkspace/SpringApp/src/com/udemy/application/Villain.txt");
		try {
			br = new BufferedReader(new FileReader(file1));
			String content = br.readLine();
			while (content != null) {
				content = br.readLine();
				villain.add(content);

			}
			
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		int index = random.nextInt(villain.size()-1);
		return villain.get(index);
		
	}
}
