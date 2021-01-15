package com.vin.employee.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vin.employee.service.entity.Employee;
import com.vin.employee.service.repository.EmployeeRepository;
import com.vin.employee.service.vo.Department;
import com.vin.employee.service.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;

	@Autowired
	public RestTemplate restTemplate;

	public Employee saveEmployee(Employee department) {
		log.info("Inside saveEmployee method of EmployeeService of EmployeeService API");
		return employeeRepository.save(department);
	}

	public ResponseTemplateVO getEmployeeByID(Long id) {
		log.info("Inside getEmployeeByID method of EmployeeService of EmployeeService API");
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		Employee employee = employeeRepository.findByEmplyeeId(id);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + employee.getDepartmentId(), Department.class);
		responseTemplateVO.setEmployee(employee);
		responseTemplateVO.setDepartment(department);
		return responseTemplateVO;
	}

}
