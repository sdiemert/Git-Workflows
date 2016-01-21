package com.sdiemert.git_test;

import junit.framework.TestCase;

public class ArithmeticTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAdd(){
		int x = Arithmetic.add(2, 3);
		assertEquals(x,5);
	}
 
	public void testSubtract(){
		int x = Arithmetic.subtract(2, 3);
		assertEquals(x,-1);
	}
	public void testMultiply(){
		int x = Arithmetic.multiply(2, 3);
		assertEquals(x,6);
	}
	public void testDivide(){
		int x = Arithmetic.divide(6, 3);
		assertEquals(x,2);
	}
}
