package com.capgemini.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2850522205438190014L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message) {
		super(message);
	}
}
