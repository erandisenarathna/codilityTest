package com.demo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.exception.SingNotAvailableException;
import com.demo.impl.Parrot;
import com.demo.impl.ParrotFactory;
import com.demo.util.Constants;

public class ParrotFactoryTest {
	
	@Test
	public void testParrot() throws SingNotAvailableException {
		Parrot parrot  = ParrotFactory.getParrot(null);
		assertEquals( Constants.SING, parrot.sing() );
		
		parrot  = ParrotFactory.getParrot("dog");
		assertEquals( "Woof, woof", parrot.sing() );
		
		parrot  = ParrotFactory.getParrot("cat");
		assertEquals( "Meow", parrot.sing() );
		
		parrot  = ParrotFactory.getParrot("rooster");
		assertEquals( "Cock-a-doodle-doo", parrot.sing() );
	}
	

}
