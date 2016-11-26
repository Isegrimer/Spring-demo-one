package com.luv2code.springdemo.Activity2;

import java.util.Arrays;

import com.luv2code.springdemo.FortuneService;

public class newImplementationFortuneService implements FortuneService {

	private String[] array ={"Live","Love","Monney"}; 
	@Override
	public String getFortune() {

		int index =(int) (Math.random()+2);
		return array[index];
	}

}
