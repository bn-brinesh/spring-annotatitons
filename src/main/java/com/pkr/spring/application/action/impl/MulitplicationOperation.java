package com.pkr.spring.application.action.impl;

import com.pkr.spring.application.action.ICalcultor;

public class MulitplicationOperation implements ICalcultor {

	@Override
	public void calculate(int num1, int num2) {
		System.out.println(num1*num2);
	}

}
