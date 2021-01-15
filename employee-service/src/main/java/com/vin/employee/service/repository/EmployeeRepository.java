package com.vin.employee.service.repository;

import org.springframework.stereotype.Repository;

import com.vin.employee.service.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findByEmplyeeId(Long id);

}
