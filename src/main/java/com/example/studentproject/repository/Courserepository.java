package com.example.studentproject.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.studentproject.entity.Course;
import com.example.studentproject.entity.Student;

@Repository
public interface Courserepository extends MongoRepository<Course,String> {

	List<Course> findByName(String courseName);
	List<Course> findByCost(String courseCost);
	
}
