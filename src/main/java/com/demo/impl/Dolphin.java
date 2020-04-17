package com.demo.impl;

import com.demo.ISwim;
import com.demo.exception.SwimNotAvailableException;
import com.demo.util.Constants;

public class Dolphin implements ISwim{
	
	public String swim() throws SwimNotAvailableException{
		System.out.println(Constants.SWIM);	
		return Constants.SWIM;
	}
	
}
