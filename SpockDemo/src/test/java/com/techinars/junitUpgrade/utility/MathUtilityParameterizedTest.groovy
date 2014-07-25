package com.techinars.junitUpgrade.utility

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author ayazlakdawala
 * 
 */
class MathUtilityParameterizedTest extends Specification {
	
	@Unroll
	def "my Test Div"(int dividend, int divisor, int result) {
		
		expect:
		MathUtility.div(dividend, divisor) == result
		
		where:
		dividend | divisor | result
		25 | 5 | 5
		18 | 6 | 3
		10 | 2 | 5
	}
	
}
