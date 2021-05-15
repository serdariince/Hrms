package com.serdariince.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serdariince.hrms.business.abstracts.JobService;
import com.serdariince.hrms.core.utilities.result.DataResultBase;
import com.serdariince.hrms.entities.conretes.Job;

@RestController
@RequestMapping("/jobs")
public class JobsControllers {

	@Autowired
	private JobService jobService;
	
	@GetMapping("/getall")
	public List<Job> getall(){
		
		return  jobService.getAll().data();
	}
	@GetMapping("/gel")
	public List<Job> gel(){
		
		return  jobService.getAll().data();
	}
	@GetMapping("/get")
	public  DataResultBase<List<Job>> get() {
	
		return jobService.getAll();
	}
}
