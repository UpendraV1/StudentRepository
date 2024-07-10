package com.example.studentproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentproject.entity.Course;
import com.example.studentproject.repository.Courserepository;

@Service
public class Courseservice {

	@Autowired
	private Courserepository repo;

	public Course courseService(Course c) {
		
		return repo.save(c);
	}

	

	public List<Course> getAllCourse() {
		
		return repo.findAll();
	}
}
