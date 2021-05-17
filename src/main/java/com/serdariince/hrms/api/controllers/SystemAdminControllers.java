package com.serdariince.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serdariince.hrms.business.abstracts.SystemAdminService;
import com.serdariince.hrms.core.api.BaseControllers;
import com.serdariince.hrms.core.utilities.result.DataResultBase;
import com.serdariince.hrms.entities.conretes.SystemAdmin;
@RestController
@RequestMapping("/admin")
public class SystemAdminControllers implements BaseControllers<SystemAdmin> {

	@Autowired
	private SystemAdminService<SystemAdmin> systemAdminService;
	
	@GetMapping	
	public DataResultBase<List<SystemAdmin>> home () {

		return systemAdminService.getall();
	}

	@GetMapping("/getall")	
	@Override
	public List<SystemAdmin> getall() {

		return systemAdminService.getall().data();
	}

	@PostMapping("/add")
	@Override
	public SystemAdmin add(@RequestBody SystemAdmin data) {
	
		return  systemAdminService.add(data).data();
	}

	@PostMapping("/update")
	@Override
	public SystemAdmin update(@RequestBody SystemAdmin data) {
		return systemAdminService.update(data).data();
	}


	@PostMapping("/delete")
	@Override
	public SystemAdmin delete(@RequestBody SystemAdmin data) {
		return systemAdminService.delete(data).data();
	}

	@GetMapping("/getbyid/{id}")
	@Override
	public SystemAdmin getById(@RequestBody int id) {
		return systemAdminService.getById(id).data();
	}

	
}
