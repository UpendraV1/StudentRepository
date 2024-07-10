package com.example.studentproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.studentproject.entity.Student;
import com.example.studentproject.exception.StudentNotExistException;
import com.example.studentproject.repository.Studentrepository;

@Service
public class Studentservice {

	@Autowired
	private Studentrepository repo;

	public Student saveStudents(Student s) {
		return repo.save(s);
	}

	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	public List<Student> getStudentsByName(String name) {
		return repo.findByName(name);
	}

	public void deleteStudent(String id) {
		
		Optional<Student> s=repo.findById(id);
		if(s.isPresent()) {
			repo.deleteById(id);
			
		}
		else {
			throw new StudentNotExistException("Student Not Exist with id"+id);
		}
		
	}

	
	
	public Student updateStudent(String id, Student s) {

		Optional<Student> si = repo.findById(id);

		if (si.isPresent()) {

			Student ns = si.get();
			ns.setGroup(s.getGroup());
			ns.setMarks(s.getMarks());
			ns.setName(s.getName());

			return repo.save(ns);
		} else {
			throw new StudentNotExistException("Student not found with id " + id);
		}

	}

	public List<Student> getStudentsByGroup(String group) {
		
		return repo.findByGroup(group);
	}

	public List<Student> getStudentsByMarks(String marks) {
		
		return repo.findByMarks(marks);
	}
	

}
