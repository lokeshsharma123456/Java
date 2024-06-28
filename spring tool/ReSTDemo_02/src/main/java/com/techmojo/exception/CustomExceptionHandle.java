package com.techmojo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandle {

	public CustomExceptionHandle() {
		// TODO Auto-generated constructor stub	
	}

	@ExceptionHandler(InvalidClassException.class)
	public ResponseEntity<ErrorResponse> method1(InvalidClassException e) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message = e.getMessage();
		ErrorResponse errorResponse = new ErrorResponse(status, message);
		return new ResponseEntity<ErrorResponse>(errorResponse, status);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> method2(Exception e) {
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		String message = e.getMessage();
		ErrorResponse errorResponse = new ErrorResponse(status, message);
		return new ResponseEntity<ErrorResponse>(errorResponse, status);

	}

}
