package com.techinars.junitUpgrade.utility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author ayazlakdawala
 * @version May 13, 2014
 */

public class StringUtilityTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("One time setup in Junit 4.x");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("One time teardown in Junit 4.x");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup per Test in Junit 4.x");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear down per Test in Junit 4.x");
	}

	/**
	 * Test method for
	 * {@link com.crsoftwareinc.framework.util.StringUtility#isEmpty(java.lang.String)}
	 * with null string as input
	 */
	@Test
	public void isStringEmptyWithNullInput() {
		assertTrue(StringUtility.isEmpty(null));
	}

	/**
	 * Test method for testing StringUtilityMethod with blank space string as
	 * input
	 */
	@Test
	public void isUnTrimmedStringEmptyWithBlankSpaceInput() {
		assertFalse(StringUtility.isUnTrimmedStringEmpty(" "));
	}
	
	/**
	 * This test demonstrates the ability to ignore test case. 
	 *
	 */
	@Ignore
	public void myIgnoredTest() {
		assertTrue(StringUtility.isEmpty(" "));
	}

}
