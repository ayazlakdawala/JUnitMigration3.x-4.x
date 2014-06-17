package com.techinars.junitUpgrade.utility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author ayazlakdawala
 * @version May 21, 2014
 * Description: This class can use 1 set of parameter based test data for Junit testing.
 */
@RunWith(Parameterized.class)
public class MathUtilityParameterisedTest {

	private int dividend;
	private int divisor;

	public MathUtilityParameterisedTest(int testDividendParameter,
			int testDivisorParameter) {
		dividend = testDividendParameter;
		divisor = testDivisorParameter;
	}

	@Parameters(name = "{0},{1}")
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 25, 5 }, { 18, 6 } };
		return Arrays.asList(data);

	}

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
	public void testDiv() {
		assertEquals(dividend / divisor, MathUtility.div(dividend, divisor));
	}

}
