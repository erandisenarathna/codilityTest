package com.demo;

import com.demo.exception.SingNotAvailableException;

public interface ISing {
	
	public String sing() throws SingNotAvailableException;
}
