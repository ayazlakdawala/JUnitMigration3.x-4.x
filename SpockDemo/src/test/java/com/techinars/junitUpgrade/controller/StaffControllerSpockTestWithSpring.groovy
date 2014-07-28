package com.techinars.junitUpgrade.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import spock.lang.Specification

import com.techinars.junitUpgrade.dao.StaffDao;
import com.techinars.junitUpgrade.dto.EmployeeDto;



import groovy.transform.CompileStatic
import groovy.transform.TypeChecked;

/**
 * @author ayazlakdawala
 * 
 */

@TypeChecked
@ContextConfiguration(locations = "/spring-context.xml" )
class StaffControllerSpockTestWithSpring extends Specification{
		
	def EmployeeDto testEmployeeDto	
	
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
						
		def mockedStaffDao = (StaffDao)Mock(StaffDao)
		
		// prepare expectation
		testEmployeeDto.setFirstName("Mocked Employee First Name");
		testEmployeeDto.setLastName("Mocked Employee Last Name");
		
		staffController.setStaffDao(mockedStaffDao)
		
		when:
		def resultEmployee = staffController.retrieveEmployeeDetails("1")
				
		then:
		1 * mockedStaffDao.getEmployeeDetails(_ as String) >> testEmployeeDto
		resultEmployee.getFirstName() == testEmployeeDto.getFirstName()	
				
		
	}		

}
