package com.vin.employee.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vin.employee.service.entity.Employee;
import com.vin.employee.service.service.EmployeeService;
import com.vin.employee.service.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("employee")
@Slf4j
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		log.info("Inside saveEmployee method of EmployeeController of EmployeeService API");
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO findByEmployeeID(@PathVariable("id") Long employeetId) {
		log.info("Inside findByEmployeeID method of EmployeeController of EmployeeService API");
		return employeeService.getEmployeeByID(employeetId);

	}
	
	@GetMapping("Hii")
	public String getHome() {
		return "Hii";
	}
}
