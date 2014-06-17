package com.techinars.junitUpgrade.utility;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author ayazlakdawala Description: This class have seperate set of parameters
 *         based test data for each test.
 */
@RunWith(JUnitParamsRunner.class)
public class MathUtilityJUnitParamsTest {

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
	@Parameters(method = "parametersForMyTestDivWithExpectionExpected")
	public void myTestDivWithExpectionExpected(int dividend, int divisor,
			Exception expClass, String excpMsg) {

		try {
			MathUtility.div(dividend, divisor);
			fail("Test failed due to expected Arithmetic expection not thrown by the logic. ");
		} catch (Exception e) {
			assertTrue(e.getClass().equals(expClass.getClass()));
			assertTrue(e.getMessage().equals(excpMsg));
		}
	}

	@SuppressWarnings({ "unused", "boxing" })
	private Object[] parametersForMyTestDivWithExpectionExpected() {
		return JUnitParamsRunner.$(JUnitParamsRunner.$(25, 0,
				new ArithmeticException(), "Divisor is Zero"),
				JUnitParamsRunner.$(10, 0, new ArithmeticException(),
						"Divisor is Zero"));
	}

	@Test
	@Parameters({ "25, 5", "18,6" })
	public void myTestDiv(int dividend, int divisor) {
		assertEquals(dividend / divisor, MathUtility.div(dividend, divisor));
	}

}
