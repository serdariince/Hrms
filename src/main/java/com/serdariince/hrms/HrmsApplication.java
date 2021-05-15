package com.serdariince.hrms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class HrmsApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}

}
