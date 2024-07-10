package com.example.studentproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentproject.entity.Course;
import com.example.studentproject.entity.Student;
import com.example.studentproject.service.Courseservice;

@RestController
@RequestMapping("/course")
public class Coursecontroller {
 
	@Autowired
	private Courseservice service;
	
	@PostMapping("/save")
	public Course courseService(@RequestBody Course c) {
		System.out.println("Received Student: " + c);
		return service.courseService(c);
	}
	
	@GetMapping("/all")
	public List<Course>getAllCourse() {
		return service.getAllCourse();
	}
	
	//this is trying to commt the code
	//new commit
	//new commit 2
	
}
