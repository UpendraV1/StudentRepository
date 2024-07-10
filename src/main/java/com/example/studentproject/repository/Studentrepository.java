package com.example.studentproject.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.studentproject.entity.Student;

public interface Studentrepository extends MongoRepository<Student,String> {
	List<Student> findByName(String name);
	List<Student> findByGroup(String group);
	List<Student> findByMarks(String marks);

}
