package com.pkr.spring.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.pkr.spring.application.action.impl.DivisionOperation;
import com.pkr.spring.application.action.impl.MulitplicationOperation;

@Configuration
@PropertySource("spring.properties")
public class SpringConfiguration {

	@Bean("mulOper")
	MulitplicationOperation getMulitplicationOperation() {
		return new MulitplicationOperation();
	}
	
	@Bean("divOper")
	DivisionOperation getDivisionOperation() {
		return new DivisionOperation();
	}
	@Bean("divOper1")
	DivisionOperation getDivisionOperation1() {
		return new DivisionOperation();
	}
}
