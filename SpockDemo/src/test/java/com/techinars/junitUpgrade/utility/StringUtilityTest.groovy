package com.techinars.junitUpgrade.utility

import spock.lang.Ignore
import groovy.transform.CompileStatic
import groovy.transform.TypeChecked;

import com.techinars.junitUpgrade.dao.StaffDao

import spock.lang.Specification

/**
 * @author ayazlakdawala
 * 
 */
@TypeChecked
class StringUtilityTest extends Specification {
	
	/**
	 * This method is a setup method for entire class
	 *
	 * @return
	 */
	def setupSpec() {
		System.out.println("One time setup in Spock")
	}
	
	/**
	* This method is a clean up method for entire class
	*
	* @return
	*/
	def cleanupSpec() {
		System.out.println("One time teardown in Spock")
	}

	/**
	 * This method is a set up method for per test method
	 *
	 * @return
	 */
	def setup() {
		System.out.println("Setup per Test in Spock")
	}

	/**
	 * This method is a set up method for per test method
	 *
	 * @return
	 */
	def cleanup() {
		System.out.println("Tear down per Test in Spock");
	}

	/**
	 * Test method for
	 * {@link com.crsoftwareinc.framework.util.StringUtility#isEmpty(java.lang.String)}
	 * with null string as input
	 */
	def "is String Empty With Null Input"() {
		expect:
		StringUtility.isEmpty(null) == true
	}

	/**
	 * Test method for testing StringUtilityMethod with blank space string as
	 * input
	 */
	def "is UnTrimmed String Empty With Blank Space Input"() {
		expect:
		StringUtility.isUnTrimmedStringEmpty(" ") == false		
	}
	
	/**
	 * This test demonstrates the ability to ignore test case.
	 *
	 */	
	@Ignore
	def "my Ignored Test"() {
		expect:
		StringUtility.isEmpty(" ") == true
	}
	
}
