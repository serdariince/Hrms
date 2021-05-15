package com.serdariince.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.serdariince.hrms.entities.conretes.Employer;

public interface EmployerDao  extends JpaRepository<Employer, Integer>{

}
