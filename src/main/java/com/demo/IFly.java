package com.demo;

import com.demo.exception.FlyNotAvailableException;

public interface IFly {
	
	public String fly() throws FlyNotAvailableException;

}
