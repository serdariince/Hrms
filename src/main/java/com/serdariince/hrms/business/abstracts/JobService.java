package com.serdariince.hrms.business.abstracts;

import java.util.List;

import com.serdariince.hrms.core.utilities.result.DataResultBase;
import com.serdariince.hrms.entities.conretes.Job;

public interface JobService {
	DataResultBase<	List<Job>> getAll();

}
