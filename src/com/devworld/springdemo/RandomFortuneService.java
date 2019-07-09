package com.devworld.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = new String[] {"First fortune", "Second fortune", "Third fortune"};
	
	@Override
	public String getFortune() {
		Random rand = new Random();
		int i = rand.nextInt(fortunes.length);
		return fortunes[i];
	}

}
