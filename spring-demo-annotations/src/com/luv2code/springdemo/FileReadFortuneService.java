package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileReadFortuneService implements FortuneService {
	
	//@Value("${foo.fortunes}")
	private String fortunes;
	private Random myRandom = new Random();
	private String txtPath = "src/fortunes.txt";
	
	public FileReadFortuneService() {

	}

	@Override
	public String getFortune() {
		System.out.println(">> FileReadFortuneService: inside method getFortune()");
		String[] arr = fortunes.split(",");
		int index = myRandom.nextInt(arr.length);
		String theFortune = arr[index];
		return theFortune;
	}
	
	@PostConstruct
	public void doMyStuff() {
		System.out.println(">> FileReadFortuneService: inside method doMyStuff()");
		try {
			Scanner read = new Scanner(new File(txtPath));
			while(read.hasNext()) {
				fortunes += read.next();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
