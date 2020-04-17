package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.impl.Clownfish;
import com.demo.impl.Shark;
import com.demo.util.Constants;

public class FishDecoratorTest {
	
	
	@Test
	public void testClownfish() {
		Clownfish fish  = new Clownfish() ;
		assertEquals( Constants.CLOWNFISH_SIZE, fish.getSize() );
		assertEquals( Constants.CLOWNFISH_COLOUR, fish.getColour() );
		assertEquals( Constants.CLOWNFISH_ACTIVITY, fish.getActivity() );
	}
	
	@Test
	public void testSharkfish() {
		Shark fish  = new Shark() ;
		assertEquals( Constants.SHARK_SIZE, fish.getSize() );
		assertEquals( Constants.SHARK_COLOUR, fish.getColour() );
		assertEquals( Constants.SHARK_ACTIVITY, fish.getActivity() );
	}


}