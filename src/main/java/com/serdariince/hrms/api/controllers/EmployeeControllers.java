package com.serdariince.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serdariince.hrms.business.abstracts.EmployeeService;
import com.serdariince.hrms.core.api.BaseControllers;
import com.serdariince.hrms.entities.conretes.Employee;


@RestController
@RequestMapping("/employee")
public class EmployeeControllers implements BaseControllers<Employee> {

	@Autowired
	private EmployeeService<Employee> employeeService;
	
	@GetMapping("/getall")	
	@Override
	public List<Employee> getall() {

		return employeeService.getall().data();
	}


	@PostMapping("/add")
	@Override
	public Employee add(@RequestBody Employee data) {
	
		return (Employee) employeeService.add(data).data();
	}

	@PostMapping("/update")
	@Override
	public Employee update(@RequestBody Employee data) {
		return employeeService.update(data).data();
	}


	@PostMapping("/delete")
	@Override
	public Employee delete(@RequestBody Employee data) {
		return employeeService.delete(data).data();
	}

	@GetMapping("/getbyid/{id}")
	@Override
	public Employee getById(@RequestBody int id) {
		return employeeService.getById(id).data();
	}






	

}
