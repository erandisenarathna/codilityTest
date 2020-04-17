package com.demo.impl;

import com.demo.exception.SingNotAvailableException;

public class Parrot extends Bird {

	private String sound;

	public Parrot() {
		super();
		this.sound = "";
	}

	public Parrot(String sound) {
		super();
		this.sound = sound;
	}

	public String sing() throws SingNotAvailableException{
		if (!sound.isEmpty()) {
			System.out.println(sound);
			return sound;
		} else {
			return super.sing();
		}
		
	}

}
