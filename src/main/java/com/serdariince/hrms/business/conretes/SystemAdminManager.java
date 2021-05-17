package com.serdariince.hrms.business.conretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serdariince.hrms.business.abstracts.SystemAdminService;
import com.serdariince.hrms.business.contants.Messages;
import com.serdariince.hrms.core.utilities.result.DataResultBase;
import com.serdariince.hrms.core.utilities.result.SuccessDataResult;
import com.serdariince.hrms.dataAccess.abstracts.SystemAdminDao;
import com.serdariince.hrms.entities.conretes.SystemAdmin;

@Service
public class SystemAdminManager implements SystemAdminService<SystemAdmin> {

	@Autowired
	private SystemAdminDao adminDao;

	@Override
	public DataResultBase<List<SystemAdmin>> getall() {
		return new SuccessDataResult<List<SystemAdmin>>(adminDao.findAll()
				,Messages.employeeAdded);
	}

	@Override
	public DataResultBase<SystemAdmin> add( SystemAdmin systemAdmin) {

		return new SuccessDataResult<SystemAdmin>(adminDao.save(systemAdmin), Messages.employeeAdded);
	}

	@Override
	public DataResultBase<SystemAdmin> delete(SystemAdmin systemAdmin) {
		adminDao.delete(systemAdmin);
		return new SuccessDataResult<SystemAdmin>(systemAdmin, Messages.employeeDelete);

	}

	@Override
	public DataResultBase<SystemAdmin> update(SystemAdmin systemAdmin) {

		return new SuccessDataResult<SystemAdmin>(adminDao.save(systemAdmin), Messages.employeeUpdate);

	}

	@Override
	public DataResultBase<SystemAdmin> getById(int id) {

		return new SuccessDataResult<SystemAdmin>(adminDao.findById(id).orElse(null));

	}

}
