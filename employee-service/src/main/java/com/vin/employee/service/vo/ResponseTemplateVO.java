package com.vin.employee.service.vo;

import com.vin.employee.service.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

	private Employee employee;
	private Department department;
}
