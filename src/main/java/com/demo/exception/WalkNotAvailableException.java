package com.demo.exception;

public class WalkNotAvailableException  extends Exception {

	private static final long serialVersionUID = 1L;
	
	public WalkNotAvailableException(String errorMessage) {
        super(errorMessage);
    }
}
