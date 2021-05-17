package com.serdariince.hrms.entities.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


import lombok.Data;

@Data
public class EmployerDto {
	@NotEmpty
	@Email
	private  String email;
	@NotEmpty
	@Size()
	private  String[] passwords;
	@NotEmpty
	private  String lastname;
	@NotEmpty
	private  String firstname;
	@NotEmpty
	private  String identification;	
	@NotEmpty
	private  String year;
}
