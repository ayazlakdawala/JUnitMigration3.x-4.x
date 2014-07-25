package com.techinars.junitUpgrade.controller

import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import spock.lang.Specification

import com.techinars.junitUpgrade.dao.StaffDao;
import com.techinars.junitUpgrade.dto.EmployeeDto;

import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.rule.PowerMockRule

import org.junit.Rule

/**
 * @author ayazlakdawala
 * 
 */

@ContextConfiguration(locations = "/spring-context.xml" )
class StaffControllerSpockTestWithSpring extends Specification{
		
	def testEmployeeDto	
	
	@Autowired
	private StaffController staffController
	
	@Autowired
	private StaffDao staffDao	
	
	def setup() {
		testEmployeeDto = new EmployeeDto()
		staffController.setStaffDao(staffDao)		
	}
	
	def "testRetrievalOfEmployeeDetailsWithoutMocking"() {
				
		// prepare expectation
		testEmployeeDto.setFirstName("Employee First Name");
		testEmployeeDto.setLastName("Employee Last Name");
		
		expect: "Retrieve Employee detail"
		staffController
				.retrieveEmployeeDetails("1").getFirstName() == testEmployeeDto.getFirstName();
		
	}
	
	def "test Retrieval Of Employee Details With Mocking"() {
						
		def mockedStaffDao = Mock(StaffDao)
		
		// prepare expectation
		testEmployeeDto.setFirstName("Mocked Employee First Name");
		testEmployeeDto.setLastName("Mocked Employee Last Name");
		
		staffController.setStaffDao(mockedStaffDao)
		
		when:
		def resultEmployee = staffController
				.retrieveEmployeeDetails("1")
		
		then:
		1 * mockedStaffDao.getEmployeeDetails(_ as String) >> testEmployeeDto
		resultEmployee.getFirstName() == testEmployeeDto.getFirstName()		
		
	}		

}
