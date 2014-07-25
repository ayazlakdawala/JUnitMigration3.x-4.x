package com.techinars.junitUpgrade.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.techinars.junitUpgrade.controller.StaffControllerSpockTestWithPowerMockito;
import com.techinars.junitUpgrade.controller.StaffControllerSpockTestWithSpring;
import com.techinars.junitUpgrade.utility.MathUtilityIgnoreRestTest;
import com.techinars.junitUpgrade.utility.MathUtilityParameterizedTest;
import com.techinars.junitUpgrade.utility.MathUtilityTest;
import com.techinars.junitUpgrade.utility.StringUtilityTest;

/**
 * @author ayazlakdawala
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ MathUtilityTest.class, MathUtilityIgnoreRestTest.class,
		MathUtilityParameterizedTest.class,
		StringUtilityTest.class,
		StaffControllerSpockTestWithPowerMockito.class,
		StaffControllerSpockTestWithSpring.class})
public class MyTestSuite {
}
