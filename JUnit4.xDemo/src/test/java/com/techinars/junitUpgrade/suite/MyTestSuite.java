package com.techinars.junitUpgrade.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.techinars.junitUpgrade.controller.StaffControllerTest;
import com.techinars.junitUpgrade.utility.MathUtilityJUnitParamsTest;
import com.techinars.junitUpgrade.utility.MathUtilityParameterisedTest;
import com.techinars.junitUpgrade.utility.MathUtilitySpringJUnitRunnerTest;
import com.techinars.junitUpgrade.utility.MathUtilityTest;
import com.techinars.junitUpgrade.utility.StringUtilityTest;

/**
 * @author ayazlakdawala
 * @version May 21, 2014
 */
@RunWith(Suite.class)
@SuiteClasses({ MathUtilityTest.class, MathUtilityJUnitParamsTest.class,
		MathUtilityParameterisedTest.class,
		MathUtilitySpringJUnitRunnerTest.class, StringUtilityTest.class,
		StaffControllerTest.class })
public class MyTestSuite {
}
