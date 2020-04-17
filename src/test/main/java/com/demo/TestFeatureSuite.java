package com.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FishDecoratorTest.class, InterfaceTest.class, ParrotFactoryTest.class, RoosterTest.class })
public class TestFeatureSuite {
	
}

