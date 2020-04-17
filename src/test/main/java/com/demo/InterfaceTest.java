package com.demo;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.demo.IFly;
import com.demo.ISing;
import com.demo.ISwim;
import com.demo.IWalk;
import com.demo.exception.SingNotAvailableException;
import com.demo.exception.WalkNotAvailableException;
import com.demo.impl.Animal;
import com.demo.impl.Bird;
import com.demo.impl.Butterfly;
import com.demo.impl.Chicken;
import com.demo.impl.Duck;
import com.demo.impl.Fish;
import com.demo.impl.Parrot;
import com.demo.impl.Rooster;

public class InterfaceTest {

	@Test
	public void testCount() {

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Butterfly() };

		List<Animal> animalList = Arrays.asList(animals);

		long flyCount = animalList.stream().filter(node -> node instanceof IFly).count();
		assertEquals(4, flyCount);

		long walkCount = animalList.stream().filter(node -> node instanceof IWalk).count();
		assertEquals(7, walkCount);

		long singCount = animalList.stream().filter(node -> node instanceof ISing).count();
		assertEquals(6, singCount);

		long swimCount = animalList.stream().filter(node -> node instanceof ISwim).count();
		assertEquals(2, swimCount);

	}

	@Test
	public void testWalkNotAvailableException(){
		Assertions.assertThrows(WalkNotAvailableException.class, new Butterfly("ButterFly")::walk);
	
	}
	
	@Test
	public void testSingNotAvailableException(){
		Assertions.assertThrows(SingNotAvailableException.class,new Fish()::sing);
		
	}

}
