package com.shaalx.spring.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
	public HelloSpring helloSpring(){
		return new HelloSpring();
	}
}
