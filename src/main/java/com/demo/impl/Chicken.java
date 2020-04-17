package com.demo.impl;

import com.demo.IFly;
import com.demo.ISing;
import com.demo.exception.FlyNotAvailableException;
import com.demo.exception.SingNotAvailableException;
import com.demo.util.Constants;

public class Chicken extends Animal implements IFly, ISing{
	
	public String fly() throws FlyNotAvailableException {
		throw new FlyNotAvailableException(Constants.NOT_FLY);		
	}

	public String sing() throws SingNotAvailableException {
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";
	}

}
