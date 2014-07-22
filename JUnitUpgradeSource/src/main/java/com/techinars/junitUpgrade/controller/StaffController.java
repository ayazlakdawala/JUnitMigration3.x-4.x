package com.techinars.junitUpgrade.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.techinars.junitUpgrade.dao.StaffDao;
import com.techinars.junitUpgrade.dto.EmployeeDto;

/**
 * @author AyazLakdawala
 * 
 */
public class StaffController {
	
	@Autowired
	private StaffDao staffDao;
	
	
	/**
	 * @return the staffDao
	 */
	public StaffDao getStaffDao() {
		return staffDao;
	}

	/**
	 * @param staffDao the staffDao to set
	 */
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}

	public EmployeeDto retrieveEmployeeDetails(String employeeId){
		
		return staffDao.getEmployeeDetails(employeeId);
		
	}
	
	public String retrieveEmployeeFirstName(String employeeId) {
		
		return staffDao.getEmployeeFirstName(employeeId);
		
	}	

}
