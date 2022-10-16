package com.project.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.project1.entity.Student;
import com.project.project1.repository.Myrepository;



@RestController


public class MyController {
	@Autowired
	private Myrepository myrepository;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello smith";
	}
	
	@GetMapping("/courses")
	public List <Student> show()
	{
		return this.myrepository.findAll();
	}
	
	@PostMapping(path="/courses", consumes= {"application/json"})
	public Student createStudent( @RequestBody Student student)
	{
		return this.myrepository.save(student);
	}

}
