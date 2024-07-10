package com.example.studentproject.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="courseData")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {

	private String courseName;
	private String courseCost;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCost() {
		return courseCost;
	}
	public void setCourseCost(String courseCost) {
		this.courseCost = courseCost;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseCost=" + courseCost + "]";
	}
	
	
	
}


