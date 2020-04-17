package com.demo.impl;

import com.demo.util.Constants;

public class Shark extends FishDecorator{

	public Shark() {
		super();
	}

	@Override
	public String getSize() {
		System.out.println(Constants.SHARK_SIZE);
		return Constants.SHARK_SIZE;
		
	}

	@Override
	public String getColour() {
		System.out.println(Constants.SHARK_COLOUR);
		return Constants.SHARK_COLOUR;
		
	}

	@Override
	public String getActivity() {
		System.out.println(Constants.SHARK_ACTIVITY);
		return Constants.SHARK_ACTIVITY;
		
	}

}
