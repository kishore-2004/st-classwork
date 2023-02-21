package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/")
	public String homepage()
	{
		return "Welcome to Student List";
	}
	@GetMapping("/list")
	public List<Student> getList(){
		List<Student> detailsList=new ArrayList<>();
		detailsList.add(new Student(101,"Dinesh",19));
		detailsList.add(new Student(102,"Deepak",18));
		detailsList.add(new Student(103,"Prasanna",17));
		detailsList.add(new Student(104,"Keerthana",16));
		return detailsList;
	}

}
