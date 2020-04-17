package com.demo.impl;


import com.demo.IFly;
import com.demo.ISing;
import com.demo.exception.FlyNotAvailableException;
import com.demo.exception.SingNotAvailableException;
import com.demo.util.Constants;

public class Bird extends Animal implements IFly, ISing {

	public String fly() throws FlyNotAvailableException {
		System.out.println(Constants.FLY);
		return Constants.FLY;
	}

	public String sing() throws SingNotAvailableException {
		System.out.println(Constants.SING);
		return Constants.SING;
	}
}
