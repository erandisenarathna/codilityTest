package com.demo;

import com.demo.exception.SwimNotAvailableException;

public interface ISwim {
	
	public String swim() throws SwimNotAvailableException;

}
