package com.prsoft.component;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	private String rollnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public Student(String name, String rollnumber) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
	}
	
	
	public Student()
	{
		
	}
	

	
	
	
	
	
	
	

}
