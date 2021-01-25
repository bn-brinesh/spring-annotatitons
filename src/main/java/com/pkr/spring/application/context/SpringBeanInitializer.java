package com.pkr.spring.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pkr.spring.application.action.CalculatorManager;

public class SpringBeanInitializer {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		ApplicationContextInitializer applicationContextInitializer = (ApplicationContextInitializer)applicationContext.getBean("applicationContextInitializer");
		CalculatorManager calculatorManager = applicationContextInitializer.getBeanByName("calcMgr", CalculatorManager.class);
		calculatorManager.getResult(6, 3);
	}
}
