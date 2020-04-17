package com.demo.impl;

public class ParrotFactory {
	
	public static Parrot getParrot(String liveWith){
	      if(liveWith == null){
	         return new Parrot();
	      }		
	      if(liveWith.equalsIgnoreCase("dog")){
	         return new Parrot("Woof, woof");
	         
	      } else if(liveWith.equalsIgnoreCase("cat")){
	         return new Parrot("Meow");
	         
	      } else if(liveWith.equalsIgnoreCase("rooster")){
	         return new Parrot("Cock-a-doodle-doo");
	      }
	      
	      return new Parrot();
	   }

}
