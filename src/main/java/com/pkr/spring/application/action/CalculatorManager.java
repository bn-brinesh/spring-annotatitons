package com.pkr.spring.application.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;

import com.pkr.spring.application.action.impl.AdditionOperation;
import com.pkr.spring.application.action.impl.DivisionOperation;
import com.pkr.spring.application.action.impl.MulitplicationOperation;
import com.pkr.spring.application.action.impl.SubtractionOperation;

public class CalculatorManager {
	
	@Autowired
	//@Lazy //This is required when the bean initialization of AdditionOperation takes after CalcMgr
	AdditionOperation additionOperation;
	
	@Autowired
	@Lazy
	@Qualifier("subtractOpr")
	SubtractionOperation subtractionOperation;
	
	@Autowired
	MulitplicationOperation mulitplicationOperation;
	
	@Autowired
	@Qualifier("divOper")
	DivisionOperation divisionOperation;
	
	@Value("${operation}")
	String operation;
	
	public void getResult(int num1, int num2) {
		switch (null == operation?"":operation) {
		case "add":
			System.out.println("Addition:");
			additionOperation.calculate(num1, num2);
			break;
		case "subtract":
			System.out.println("Subtraction:");
			subtractionOperation.calculate(num1, num2);
			break;
		case "multiply":
			System.out.println("Multiplication:");
			mulitplicationOperation.calculate(num1, num2);
			break;
		case "divide":
			System.out.println("Division:");
			divisionOperation.calculate();
			break;
		default:
			System.out.println("No operation is specified");
			break;
		}
	}
}