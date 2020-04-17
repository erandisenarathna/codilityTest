package com.demo.exception;

public class SwimNotAvailableException extends Exception {

	private static final long serialVersionUID = 1L;

	public SwimNotAvailableException(String errorMessage) {
        super(errorMessage);
    }
}
