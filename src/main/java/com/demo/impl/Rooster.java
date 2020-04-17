package com.demo.impl;

import java.util.HashMap;
import java.util.Map;

import com.demo.exception.FlyNotAvailableException;
import com.demo.exception.SingNotAvailableException;

public class Rooster extends Animal{
	
	private Chicken chicken;
	
	private String lang;
	
	static final Map<String, String> languages = new HashMap<String , String>() {{
		put("Danish", "kykyliky");
		put("Finnish", "kukko kiekuu");
		put("English", "Cock-a-doodle-doo");
	}};
	
	public Rooster() {
		super();
		this.chicken = new Chicken();
	}
	
	public Rooster(String lang) {
		super();
		this.chicken = new Chicken();
		this.lang = lang;
	}
	
	public String fly() throws FlyNotAvailableException {
		return chicken.fly();		
	}

	public String sing() throws SingNotAvailableException{
		String language = languages.get("English");
		if(lang!=null &&  languages.get(lang) !=null)	{
			System.out.println(languages.get(lang));
			language = languages.get(lang);
		} 
           return language;
			
	}

}
