package com.pkr.spring.application.action.impl;

import org.springframework.stereotype.Service;
import com.pkr.spring.application.action.ICalcultor;

@Service
public class AdditionOperation implements ICalcultor {

	@Override
	public void calculate(int num1, int num2) {
		System.out.println(num1+num2);
	}
}