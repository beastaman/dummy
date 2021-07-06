package com.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages="com.controller")
public class ViewResolver1 {
	
	
//	@Bean
//	public ViewResolver internalResourceViewResolver() {
//	    InternalResourceViewResolver bean = new InternalResourceViewResolver();
//	    bean.setViewClass(JstlView.class);
//	    bean.setPrefix("/WEB-INF/");
//	    bean.setSuffix(".jsp");
//	    return bean;
//	}

}
