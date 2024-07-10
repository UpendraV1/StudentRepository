package com.example.studentproject.exception;

public class StudentNotExistException extends RuntimeException {
	
    public StudentNotExistException(String message) {
        super(message);
    }
}
