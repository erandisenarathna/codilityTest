package com.demo;

import java.util.Arrays;
import java.util.List;

import com.demo.impl.Animal;
import com.demo.impl.Bird;
import com.demo.impl.Butterfly;
import com.demo.impl.Chicken;
import com.demo.impl.Duck;
import com.demo.impl.Fish;
import com.demo.impl.Parrot;
import com.demo.impl.Rooster;

public class Solution {
	public static void main(String[] args) throws Exception {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Butterfly()
				};
		
		List<Animal> animalList  = Arrays.asList(animals);
		long flyCount = animalList
		            .stream()
		            .filter(node -> node instanceof IFly)
		            .count();
		System.out.println("Number of animal can fly " + flyCount);
		long walkCount = animalList
	            .stream()
	            .filter(node -> node instanceof IWalk)
	            .count();
		System.out.println("Number of animal can walk " + walkCount);
		long singCount = animalList
	            .stream()
	            .filter(node -> node instanceof ISing)
	            .count();
		System.out.println("Number of animal can sing " + singCount);
		long swimCount = animalList
	            .stream()
	            .filter(node -> node instanceof ISwim)
	            .count();
		System.out.println("Number of animal can swim " + swimCount);
		}
	
	
}
