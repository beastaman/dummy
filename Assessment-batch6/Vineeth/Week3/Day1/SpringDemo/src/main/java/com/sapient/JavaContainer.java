package com.sapient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sapient")
public class JavaContainer {

	@Bean
	public Details getDetails() {
		return new Details(1, "Vineeth", 21);
	}

}
