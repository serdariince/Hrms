package com.serdariince.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serdariince.hrms.entities.conretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
