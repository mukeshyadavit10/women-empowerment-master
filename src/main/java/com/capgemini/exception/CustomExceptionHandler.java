package com.capgemini.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException() {
		LOG.error("handleUserNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This User is NOT available in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}

	
	
	//------------------------------------------------------------------------------------------
	
	@ExceptionHandler(UserAlreadyExistsException.class)
	public ResponseEntity<Object> handleUserAlreadyPresentException() {
		LOG.error("handleUserAlreadyPresentException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User already present in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.BAD_REQUEST);
	}
	
	//------------------------------------------------------------------------------------------

	@ExceptionHandler(NoUsersFoundException.class)
	public ResponseEntity<Object> handleNoUsersFoundException() {
		LOG.error("handleNoUsersFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "No User found in database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.BAD_REQUEST);
	}

	
	//------------------------------------------------------------------------------------------

	@ExceptionHandler(IncorrectLoginCredentialsException.class)
	public ResponseEntity<Object> handleIncorrectLoginCredantialsException() {
		LOG.error("handleNoUsersFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Incorrect Login Credantials found in database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.BAD_REQUEST);
	}

	

}

