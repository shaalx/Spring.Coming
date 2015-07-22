package com.shaalx.spring.beans;

public class HelloSpring {
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public void hello(){
		System.out.println("hello:"+name);
	}
}
