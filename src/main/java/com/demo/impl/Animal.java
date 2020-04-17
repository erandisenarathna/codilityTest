package com.demo.impl;

import com.demo.IWalk;
import com.demo.exception.WalkNotAvailableException;
import com.demo.util.Constants;

public class Animal implements IWalk {

	public String walk() throws WalkNotAvailableException {
		System.out.println(Constants.WALK);
		return Constants.WALK;
	}
}
