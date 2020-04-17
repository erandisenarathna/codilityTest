package com.demo.impl;

import com.demo.ISing;
import com.demo.ISwim;
import com.demo.exception.SingNotAvailableException;
import com.demo.exception.SwimNotAvailableException;
import com.demo.util.Constants;

public class Duck extends Animal implements ISing, ISwim {

	public String sing() throws SingNotAvailableException {
		System.out.println("Quack, quack");
		return "Quack, quack";
	}

	public String swim() throws SwimNotAvailableException{
		System.out.println(Constants.SWIM);
		return Constants.SWIM;
	}

}
