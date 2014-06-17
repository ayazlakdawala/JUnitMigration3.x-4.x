package com.techinars.junitUpgrade.utility;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author ayazlakdawala
 * @version May 21, 2014
 */
public class MathUtilityTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void myTestDiv() {
		assertEquals(5, MathUtility.div(25, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void myTestDivWithExpectionExpected() {
		assertEquals(5, MathUtility.div(25, 0));
	}

	@Test
	public void myTestDivWithExpectedExceptionMessage() {
		exception.expect(ArithmeticException.class);
		exception.expectMessage("Divisor is Zero");
		assertEquals(5, MathUtility.div(25, 0));
	}

}
