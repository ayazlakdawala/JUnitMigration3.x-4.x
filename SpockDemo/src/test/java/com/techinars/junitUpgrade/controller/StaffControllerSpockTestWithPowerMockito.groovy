package com.techinars.junitUpgrade.controller

import org.junit.Test;
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

@PrepareForTest([StaffDao.class])
@ContextConfiguration(locations = "/spring-context.xml" )
class StaffControllerSpockTestWithPowerMockito extends Specification{
		
	def testEmployeeDto	
	
	@Autowired
	private StaffController staffController
	
	@Autowired
	private StaffDao staffDao
	
	@Rule
	public PowerMockRule rule = new PowerMockRule();
	
	def setup() {
		testEmployeeDto = new EmployeeDto()
		staffController.setStaffDao(staffDao)		
	}
	
	def "test Retrieve Employee First Name"(){
		StaffDao staffDao = PowerMockito.spy(new StaffDao());
		
		// set the spied dao in controller
				staffController.setStaffDao(staffDao);
				
		String mockedMessage = "Mocked First Name";
		
		when:		 
		PowerMockito.doReturn(mockedMessage).when(staffDao, "getFirstName", Mockito.any());
		def String result = staffController.retrieveEmployeeFirstName(_ as String)

		then:
		result == mockedMessage
	}
	

}
