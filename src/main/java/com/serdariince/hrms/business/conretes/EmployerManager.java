package com.serdariince.hrms.business.conretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serdariince.hrms.business.abstracts.EmployerService;
import com.serdariince.hrms.business.contants.Messages;
import com.serdariince.hrms.core.utilities.result.DataResultBase;
import com.serdariince.hrms.core.utilities.result.SuccessDataResult;
import com.serdariince.hrms.dataAccess.abstracts.EmployerDao;
import com.serdariince.hrms.entities.conretes.Employer;

@Service
public class EmployerManager implements EmployerService<Employer> {

	@Autowired
	private EmployerDao employerDao;

	@Override
	public DataResultBase<List<Employer>> getall() {

		return new SuccessDataResult<List<Employer>>(employerDao.findAll());
	}
 
	@Override
	public DataResultBase<Employer> add(Employer employee) {

		return new SuccessDataResult<Employer>(employerDao.save(employee), Messages.employeeAdded);
	}

	@Override
	public DataResultBase<Employer> delete(Employer employee) {
		employerDao.delete(employee);
		return new SuccessDataResult<Employer>(employee, Messages.employeeDelete);

	}

	@Override
	public DataResultBase<Employer> update(Employer employee) {

		return new SuccessDataResult<Employer>(employerDao.save(employee), Messages.employeeUpdate);

	}

	@Override
	public DataResultBase<Employer> getById(int id) {

		return new SuccessDataResult<Employer>(employerDao.findById(id).orElse(null));

	}

}
