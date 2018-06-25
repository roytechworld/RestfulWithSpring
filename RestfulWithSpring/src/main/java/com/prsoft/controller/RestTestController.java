package com.prsoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prsoft.component.Student;

@RestController
public class RestTestController {

	@RequestMapping("students")
	public List<Student> getStudentList()
	{
		List<Student> stlist=new ArrayList<Student>();
		
	     stlist.add(new Student("rahul","23"));
	     stlist.add(new Student("Arnav","23"));
	     stlist.add(new Student("vikash","23"));
	     stlist.add(new Student("atul","23"));
		
		return stlist;
	}
	
}
