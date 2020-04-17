package com.demo;

import com.demo.exception.WalkNotAvailableException;

public interface IWalk {

	public String walk() throws WalkNotAvailableException;
}
