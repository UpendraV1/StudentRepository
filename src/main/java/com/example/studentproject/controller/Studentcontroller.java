package com.example.studentproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentproject.entity.Student;
import com.example.studentproject.service.Studentservice;



@RestController
@RequestMapping("/student")
public class Studentcontroller {
	
	
	@Autowired
	private Studentservice service;
	
	@PostMapping("/save")
	public Student saveStudents(@RequestBody Student s) {
		System.out.println("Received Student: " + s);
		return service.saveStudents(s);
	}
	
	@GetMapping("/all")
	public List<Student>getAllStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/name/{name}")
	public List<Student> getStudentsByName(@PathVariable String name) {
		return service.getStudentsByName(name);
	}
	

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
    }
    
    @PutMapping("/update")
    public Student updateStudent(@RequestParam String id, @RequestBody Student s) {
    	return service.updateStudent(id,s);
    	
    }
    
	@GetMapping("/group/{group}")
	public List<Student> getStudentsByGroup(@PathVariable String group) {
		return service.getStudentsByGroup(group);
	}
	
	@GetMapping("/marks/{marks}")
	public List<Student> getStudentsByMarks(@PathVariable String marks) {
		return service.getStudentsByMarks(marks);
	}


}
