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
@Table(name = "employers")
public class Employer extends User {
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "website")
	private String website;

}
