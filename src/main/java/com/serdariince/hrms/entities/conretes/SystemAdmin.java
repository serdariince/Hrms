package com.serdariince.hrms.entities.conretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.serdariince.hrms.entities.abstracts.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@Table(name = "systemAdmin")
public class SystemAdmin extends User{
	@Column(name = "lastname",length = 125)
	private  String lastname;
	
	@Column(name = "firstname",length = 125)
	private  String firstname;
	
	@Column(name = "identification",length = 11)
	private  String identification;	
	
	@Column(name = "status")
	private  boolean status;
}
