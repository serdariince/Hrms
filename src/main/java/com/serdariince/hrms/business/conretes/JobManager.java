package com.serdariince.hrms.business.conretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serdariince.hrms.business.abstracts.JobService;
import com.serdariince.hrms.business.contants.Messages;
import com.serdariince.hrms.core.utilities.result.DataResultBase;
import com.serdariince.hrms.core.utilities.result.ResultBase;
import com.serdariince.hrms.core.utilities.result.SuccessDataResult;
import com.serdariince.hrms.core.utilities.result.SuccessResult;
import com.serdariince.hrms.dataAccess.abstracts.JobDao;
import com.serdariince.hrms.entities.conretes.Job;

@Service
public class JobManager implements JobService{

	@Autowired
	private JobDao jobDao;
	
	
	@Override
	public DataResultBase< List<Job>> getAll() {
	return new SuccessDataResult<List<Job>>(jobDao.findAll(), Messages.getAll);
	}
	public ResultBase geAll() {
		
	return new SuccessResult();
	}
}
