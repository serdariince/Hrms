package com.serdariince.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serdariince.hrms.entities.conretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
