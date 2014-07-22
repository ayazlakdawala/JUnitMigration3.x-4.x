package com.techinars.junitUpgrade.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.techinars.junitUpgrade.dto.EmployeeDto;

/**
 * @author AyazLakdawala
 * 
 */
public class StaffDao {
	
    @Resource
	private Map<String, EmployeeDto> employeeDB;
	
	
	/**
	 * This method 
	 *
	 * @param employeeId
	 * @return
	 */
	public EmployeeDto getEmployeeDetails(String employeeId) {
		System.out.println("Inside Dao");
		return employeeDB.get(employeeId);
		
	}
	
	public String getEmployeeFirstName(String employeeId) {
		return this.getFirstName(employeeId);
	}

	/**
	 * This method 
	 *
	 * @param employeeId
	 */
	private String getFirstName(String employeeId) {		
		
		return "Test First Name";
		
	}
	

}
