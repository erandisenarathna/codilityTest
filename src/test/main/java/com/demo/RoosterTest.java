package com.demo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.exception.SingNotAvailableException;
import com.demo.impl.Rooster;

public class RoosterTest {
	
	@Test
	public void testRooster() throws SingNotAvailableException {
		
		Rooster rooster = new Rooster();
		assertEquals( "Cock-a-doodle-doo", rooster.sing() );
		
		rooster = new Rooster("Danish");
		assertEquals( "kykyliky", rooster.sing() );
				
	}

}
