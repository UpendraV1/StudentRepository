package com.example.studentproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/all")
	public List<Course>getAllCourse() {
		return service.getAllCourse();
	}
	
}
