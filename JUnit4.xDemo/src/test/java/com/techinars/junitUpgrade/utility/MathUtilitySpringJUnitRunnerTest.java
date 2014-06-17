package com.techinars.junitUpgrade.utility;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.techinars.junitUpgrade.utility.dto.ParameterProviderDto;

/**
 * @author ayazlakdawala
 * @version May 21, 2014
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-context.xml",
		"/spring-context.xml" })
public class MathUtilitySpringJUnitRunnerTest {

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

	@Autowired
	private ParameterProviderDto parameterProviderDto;

	@Autowired
	private MathUtility mathUtility;

	/**
	 * This method tests the config loaded from test-context.xml
	 *
	 */
	@Test
	public void myTestDivWithExpectionExpected() {

		assertEquals(
				parameterProviderDto.getDividend()
						/ parameterProviderDto.getDivisor(), MathUtility.div(
						parameterProviderDto.getDividend(),
						parameterProviderDto.getDivisor()));

	}

	/**
	 * This method the config loaded from application's context i.e
	 * spring-context.xml
	 *
	 */
	@Test
	public void myTestMathUtilityClassDescription() {

		assertEquals("This is a Math Uitlity Class",
				mathUtility.getClassDescription());

	}

}
