package com.vin.department.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.department.service.entity.Department;
import com.vin.department.service.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside saveDepartment method of HomeController of DepartmentService");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/{id}")
	public Department findByDepartmentID(@PathVariable("id") Long departmentId) {
		log.info("Inside findByDepartmentID method of HomeController of DepartmentService");
		return departmentService.getDepartmentByID(departmentId);

	}

	@GetMapping("/Hii")
	public String getHome() {
		return "Hii";
	}

}
