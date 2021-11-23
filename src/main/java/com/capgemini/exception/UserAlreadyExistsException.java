package com.capgemini.exception;

public class UserAlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = 8127600008168972845L;

	public UserAlreadyExistsException() {
		super();
	}

	public UserAlreadyExistsException(String message) {
		super(message);
	}


}
