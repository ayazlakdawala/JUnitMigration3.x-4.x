package com.techinars.junitUpgrade.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import spock.lang.Specification

import com.techinars.junitUpgrade.dao.StaffDao;
import com.techinars.junitUpgrade.dto.EmployeeDto;

/**
 * @author ayazlakdawala
 * 
 */

@ContextConfiguration(locations = "/spring-context.xml" )
class StaffControllerTestWithSpock extends Specification{
	
	@Autowired
	private StaffController staffController;
	
	
	def "testRetrievalOfEmployeeDetailsWithoutMocking"() {
		
		def EmployeeDto actualEmployeeDto
		def EmployeeDto testEmployeeDto = new EmployeeDto();
		
		// prepare expectation
		testEmployeeDto.setFirstName("Employee First Namefdg");
		testEmployeeDto.setLastName("Employee Last Name");
		
		expect: "Retrieve Employee detail"
		staffController
				.retrieveEmployeeDetails("1").getFirstName() == testEmployeeDto.getFirstName();
		
	}
	
	def "testRetrievalOfEmployeeDetailsWithMocking"() {
		
		def EmployeeDto actualEmployeeDto
		def EmployeeDto testEmployeeDto = new EmployeeDto();
		def StaffDao mockedStaffDao = Mock(StaffDao)
		
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
