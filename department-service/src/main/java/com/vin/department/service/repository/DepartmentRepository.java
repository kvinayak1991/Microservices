package com.vin.department.service.repository;

import org.springframework.stereotype.Repository;

import com.vin.department.service.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long id);

}
