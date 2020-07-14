package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/getEmployeeData",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeService getEmployeeData()
	{
		employeeService.setId(310);
		employeeService.setName("jaan");
		employeeService.setAddress("blr");
		return employeeService;
		
		
		
	}
	
	

}
