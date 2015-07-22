package com.shaalx.spring.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*HelloSpring hs = new HelloSpring();
		
		hs.setName("Spring");
		
		hs.hello();*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hs = (HelloSpring)ctx.getBean("helloSpring");
		hs.hello();
	}
}
