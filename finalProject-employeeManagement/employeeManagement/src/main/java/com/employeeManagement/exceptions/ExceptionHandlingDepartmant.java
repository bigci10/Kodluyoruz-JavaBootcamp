package com.employeeManagement.exceptions;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlingDepartmant extends RuntimeException {

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> methodNullPointerExceptionHandler (NullPointerException e)
	{
		String message = e.getMessage();
		return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler
	public ResponseEntity<String> methodNotFoundExceptionHandler (ChangeSetPersister.NotFoundException e)
	{
		String message = e.getMessage();
		return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
	}



		
}
	
	


