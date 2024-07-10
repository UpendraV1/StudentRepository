package com.example.studentproject.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="studentData")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student { 
	
	@Id
	private String id ;
	private String name;
	private String group;
	private int marks;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	// toString method
	@Override
	public String toString() {
		return "Student{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", group='" + group + '\'' +
				", marks=" + marks +
				'}';
	}
}
