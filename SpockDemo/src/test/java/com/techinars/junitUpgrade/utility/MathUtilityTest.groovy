package com.techinars.junitUpgrade.utility

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techinars.junitUpgrade.utility.MathUtility;

import spock.lang.Specification

/**
 * @author ayazlakdawala
 * 
 */
class MathUtilityTest extends Specification{
	
	
	def "my Test Div With Expection Expected"() {
		
		when:
		MathUtility.div(25, 0)
		
		then:
		thrown(ArithmeticException)
	}

	
	def "my Test Div With Expected Exception Message"() {
		when:
		MathUtility.div(25, 0)
		
		then:
		def e = thrown(ArithmeticException)
		e.getMessage() == "Divisor is Zero"
	}

}
