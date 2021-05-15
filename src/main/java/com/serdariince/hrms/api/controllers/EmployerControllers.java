package com.serdariince.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serdariince.hrms.business.abstracts.EmployerService;
import com.serdariince.hrms.core.api.BaseControllers;
import com.serdariince.hrms.entities.conretes.Employer;
@RestController
@RequestMapping("/employers")
public class EmployerControllers implements BaseControllers<Employer> {

	@Autowired
	private EmployerService<Employer> employerService;
	
	@GetMapping("/getall")	
	@Override
	public List<Employer> getall() {

		return employerService.getall().data();
	}


	@PostMapping("/add")
	@Override
	public Employer add(@RequestBody Employer data) {
	
		return  employerService.add(data).data();
	}

	@PostMapping("/update")
	@Override
	public Employer update(@RequestBody Employer data) {
		return employerService.update(data).data();
	}


	@PostMapping("/delete")
	@Override
	public Employer delete(@RequestBody Employer data) {
		return employerService.delete(data).data();
	}

	@GetMapping("/getbyid/{id}")
	@Override
	public Employer getById(@RequestBody int id) {
		return employerService.getById(id).data();
	}


}
