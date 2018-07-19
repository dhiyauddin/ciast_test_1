package com.testingJUnit.mathematic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathematorTest {
	
	private Mathemator classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Mathemator();
	}

	@Test
	public void testSubstraction() {
		// java substract it down!
		long result = 100 - 56 - (-12) - 10;
		
		//compare with Mathemator;
		assertEquals(result , classUnderTest.substraction(100, 56, -12, 10));
		
		result = 0;
		assertEquals(result, classUnderTest.substraction(0));
	}

	@Test
	public void testAddition() {
		// java add it up!
		long result = (10 + 23) + (-2) + 15;
		
		// compare with Mathemator
		assertEquals(result, classUnderTest.addition(10, 23, -2, 15));
		
		result = 100 + 102;
		assertEquals(result, classUnderTest.addition(100 + 102));
		
		result = 0;
		assertEquals(result, classUnderTest.addition(0, 0, 0, 0));
	}
	
	@Test
	public void testMultiply() {
		// java multiply it up!
		long result = 2 * 3 * 3 * 4 * 5 ;
		
		// compare with Mathemator
		assertEquals(result, classUnderTest.multiply(2, 3, 3, 4, 5));
		
		result = 0;
		assertEquals(result, classUnderTest.multiply(0, 0, 0, 0));
	}
	
	@Test
	public void testDivisionfor2() {
		// java divide it down!
		long result = 48 / 2 / 2 / 2 / 2;
		
		// compare with Mathemator
		assertEquals(result, classUnderTest.divide2(48,2,2,2,2));
		
	}

}
