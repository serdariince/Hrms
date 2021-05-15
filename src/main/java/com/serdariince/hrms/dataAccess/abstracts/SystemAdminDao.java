package com.serdariince.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serdariince.hrms.entities.conretes.SystemAdmin;

public interface SystemAdminDao extends JpaRepository<SystemAdmin, Integer> {

}
