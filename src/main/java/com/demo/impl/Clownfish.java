package com.demo.impl;

import com.demo.util.Constants;

public class Clownfish extends FishDecorator {
	
	public Clownfish() {
		super();
	}
	
	@Override
	public String getSize() {
		System.out.println(Constants.CLOWNFISH_SIZE);
		return Constants.CLOWNFISH_SIZE;
	}

	@Override
	public String getColour() {
		System.out.println(Constants.CLOWNFISH_COLOUR);		
		return Constants.CLOWNFISH_COLOUR;
	}

	@Override
	public String getActivity() {
		System.out.println(Constants.CLOWNFISH_ACTIVITY);
		return Constants.CLOWNFISH_ACTIVITY;
		
	}

}
