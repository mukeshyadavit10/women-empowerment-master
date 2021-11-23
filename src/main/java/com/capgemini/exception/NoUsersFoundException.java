package com.capgemini.exception;

public class NoUsersFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NoUsersFoundException() {
		super();
	}

	public NoUsersFoundException(String message) {
		super(message);
	}

}
