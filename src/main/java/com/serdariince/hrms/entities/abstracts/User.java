package com.serdariince.hrms.entities.abstracts;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


import lombok.Data;


@Data
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	@Column(name="telefone")
	private String  telefone;
	
	@Column(name="email")
	private String email;

	@Column(name="passwordhash")
	private String passwordhash;
	
	@Column(name="passwordsalt")
	private String passwordsalt;

}
