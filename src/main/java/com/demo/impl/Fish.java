package com.demo.impl;

import com.demo.ISing;
import com.demo.ISwim;
import com.demo.exception.SingNotAvailableException;
import com.demo.exception.SwimNotAvailableException;
import com.demo.exception.WalkNotAvailableException;
import com.demo.util.Constants;

public class Fish extends Animal implements ISing, ISwim {

	public String swim() throws SwimNotAvailableException{
		System.out.println(Constants.SWIM);	
		return Constants.SWIM;
	}

	public String sing() throws SingNotAvailableException {
		throw new SingNotAvailableException(Constants.NOT_SING);
		
	}
	
	public String walk() throws WalkNotAvailableException {
		throw new WalkNotAvailableException(Constants.NOT_WALK);
	}

}
