package com.techinars.junitUpgrade.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.techinars.junitUpgrade.dao.StaffDao;
import com.techinars.junitUpgrade.dto.EmployeeDto;

/**
 * @author AyazLakdawala
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-context.xml" })
@PrepareForTest(StaffDao.class)
public class StaffControllerTestWithPowerMockito {
	

	private EmployeeDto testEmployeeDto;

	/*
	 * Use PowerMockRule to bootstrap test class with PowerMockRunner functionality. 
	 * This is used so that the test class can use other Runners while still benefitting from PowerMockRunner's functionality.
	 * When using only PowerMockRunner functionality, this can be replaced by @RunWith(PowerMockRunner.class)  
	 * 
	 */
	@Rule
	public PowerMockRule rule = new PowerMockRule();

	@Autowired
	private StaffController staffController;
	
	@Autowired
	private StaffDao staffDao;
	
			
	/**
	 * This method
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
			
		testEmployeeDto = new EmployeeDto();
		staffController.setStaffDao(staffDao);
	}

	/**
	 * This method
	 *
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * This method
	 *
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test method for
	 * {@link com.techinars.junitUpgrade.controller.StaffController#retrieveEmployeeDetails(int)}
	 * .
	 */
	@Test
	public void testRetrievalOfEmployeeDetailsWithoutMocking() {

		// prepare expectation
		testEmployeeDto.setFirstName("Mocked Employee First Name");
		testEmployeeDto.setLastName("Mocked Employee Last Name");

		EmployeeDto actualEmployeeDto = staffController
				.retrieveEmployeeDetails("1");
		assertFalse(actualEmployeeDto.getFirstName().equals(
				testEmployeeDto.getFirstName()));
	}

	/**
	 * Test method for
	 * {@link com.techinars.junitUpgrade.controller.StaffController#retrieveEmployeeDetails(int)}
	 * .
	 */
	@Test
	public void testMockingRetrievalOfEmployeeDetails() {
				
		//create a mock object for Dao class.
		 StaffDao mockedStaffDao = PowerMockito.mock(StaffDao.class);

		// prepare expectation
		testEmployeeDto.setFirstName("Mocked Employee First Name");
		testEmployeeDto.setLastName("Mocked Employee Last Name");

		// set the mocked dao in controller
		staffController.setStaffDao(mockedStaffDao);

		// mock the method call
		Mockito.when(mockedStaffDao.getEmployeeDetails(Mockito.anyString()))
				.thenReturn(testEmployeeDto);

		EmployeeDto actualEmployeeDto = staffController
				.retrieveEmployeeDetails("1");
		assertTrue(actualEmployeeDto.getFirstName().equals(
				testEmployeeDto.getFirstName()));

	}	
	
	@Test
	public void testRetrieveEmployeeFirstName() throws Exception {
		StaffDao staffDao = PowerMockito.spy(new StaffDao());
		
		// set the spied dao in controller
				staffController.setStaffDao(staffDao);
				
		String mockedMessage = "Mocked First Name";
		
		 // use PowerMockito to set up your expectation
        PowerMockito.doReturn(mockedMessage).when(staffDao, "getFirstName", Mockito.anyString());
              

        // execute your test
        assertTrue(staffController.retrieveEmployeeFirstName("1").equals(mockedMessage));
	}

}
