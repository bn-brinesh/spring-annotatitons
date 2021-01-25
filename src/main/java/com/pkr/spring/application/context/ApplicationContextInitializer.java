package com.pkr.spring.application.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextInitializer implements ApplicationContextAware {
	
	private ApplicationContext appContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appContext = applicationContext;
	}
	
	public <T> T getBeanByName(String beanName, Class<T> className) {
		return appContext.getBean(beanName,className);
	}
	
	public <T> T getBean(Class<T> className) {
		return appContext.getBean(className);
	}
}
