package com.demo.exception;

public class FlyNotAvailableException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public FlyNotAvailableException(String errorMessage) {
        super(errorMessage);
    }
}
