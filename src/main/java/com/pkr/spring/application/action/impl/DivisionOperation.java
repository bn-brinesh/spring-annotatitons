package com.pkr.spring.application.action.impl;

import org.springframework.beans.factory.annotation.Value;

public class DivisionOperation {
	
	@Value("8")
	int value;
	
	@Value("${num1}")
	int num1;
	
	@Value("${num2}")
	int num2;

	public void calculate() {
		System.out.println("@value implemented :"+value);
		System.out.println(num1/num2);
	}
	
}