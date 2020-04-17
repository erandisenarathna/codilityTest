package com.demo.impl;

import com.demo.IFly;
import com.demo.ISing;
import com.demo.exception.FlyNotAvailableException;
import com.demo.exception.SingNotAvailableException;
import com.demo.exception.WalkNotAvailableException;
import com.demo.util.Constants;

public class Butterfly extends Animal implements IFly, ISing {
	
	private String type;

	public Butterfly(String type) {
		super();
		this.type = type;
	}

	public Butterfly() {
		super();
		this.type = "ButterFly";
	}

	public String fly() throws FlyNotAvailableException {
		if (type.equalsIgnoreCase("ButterFly")) {
			System.out.println(Constants.FLY);
			return Constants.FLY;
		} else {
			throw new FlyNotAvailableException(Constants.NOT_FLY);
		}

	}

	public String sing() throws SingNotAvailableException {
		throw new SingNotAvailableException(Constants.NOT_SING);

	}

	@Override
	public String walk() throws WalkNotAvailableException {
		if (type.equalsIgnoreCase("ButterFly")) {
			throw new WalkNotAvailableException(Constants.NOT_WALK);
		} else {
			System.out.println(Constants.WALK);
			return Constants.WALK;
		}
	}

}
