package com.capgemini.exception;

public class IncorrectLoginCredentialsException extends RuntimeException {

	private static final long serialVersionUID = -5841460575004404518L;
	
	public IncorrectLoginCredentialsException() {
		super();
	}

	public IncorrectLoginCredentialsException(String message) {
		super(message);
	}

	
	

}
