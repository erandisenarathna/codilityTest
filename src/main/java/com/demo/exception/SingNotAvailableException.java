package com.demo.exception;

public class SingNotAvailableException  extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SingNotAvailableException(String errorMessage) {
        super(errorMessage);
    }

}
