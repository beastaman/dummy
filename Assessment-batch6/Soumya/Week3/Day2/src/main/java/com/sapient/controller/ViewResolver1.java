package com.sapient.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sapient.controller")
public class ViewResolver1 {

//	@Bean
//	public ViewResolver internalResourceViewResolver() {
//		InternalResourceViewResolver bean = new InternalResourceViewResolver();
//		bean.setViewClass(JstlView.class);
//		bean.setPrefix("/WEB-INF/view/");
//		bean.setSuffix(".jsp");
//		return bean;
//	}

}
