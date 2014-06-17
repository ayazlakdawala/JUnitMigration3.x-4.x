package com.techinars.junitUpgrade.utility;

import junit.framework.TestCase;

/**
 * @author ayazlakdawala
 * @version May 21, 2014
 * 
 */

public class MathUtilityTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testDivWithExpectionExpected() {

		try {
			MathUtility.div(25, 0);
			fail("Test Failed since expected Arithmatic exception was not thrown.");

		} catch (ArithmeticException ae) {
			assertTrue("Test Passed", true);
		}
	}

	public void testDivWithExcpectedExpectionMessage() {

		try {
			MathUtility.div(25, 0);
			fail("Test Failed since expected Arithmatic exception was not thrown.");

		} catch (ArithmeticException ae) {
			assertEquals("Divisor is Zero", ae.getMessage());
		}
	}

}
