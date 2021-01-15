package com.vin.department.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.department.service.entity.Department;
import com.vin.department.service.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	public DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentService of DepartmentService API");
		return departmentRepository.save(department);
	}

	public Department getDepartmentByID(Long id) {
		log.info("Inside getDepartmentByID method of DepartmentService of DepartmentService API");
		return departmentRepository.findByDepartmentId(id);
	}

}
