package com.techinars.junitUpgrade.suite;

import com.techinars.junitUpgrade.utility.MathUtilityTest;
import com.techinars.junitUpgrade.utility.StringUtilityTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author ayazlakdawala
 * @version May 21, 2014
 */
public class MyTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite(MathUtilityTest.class);
		suite.addTest(StringUtilityTest.suite());
		return suite;
	}

}
