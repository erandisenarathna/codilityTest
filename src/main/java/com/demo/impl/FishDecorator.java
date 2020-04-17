package com.demo.impl;

public abstract class FishDecorator extends Fish {
	
	private Fish fish; 
	
    public FishDecorator()  {  
        this.fish=new Fish();  
    }  
   
    public abstract String getSize() ;
    
    public abstract String getColour(); 
    
    public abstract String getActivity();
}
