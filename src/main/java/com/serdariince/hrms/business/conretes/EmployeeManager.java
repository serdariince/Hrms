package com.serdariince.hrms.business.conretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serdariince.hrms.business.abstracts.EmployeeService;
import com.serdariince.hrms.business.contants.Messages;
import com.serdariince.hrms.core.utilities.result.DataResultBase;
import com.serdariince.hrms.core.utilities.result.SuccessDataResult;
import com.serdariince.hrms.dataAccess.abstracts.EmployeeDao;
import com.serdariince.hrms.entities.conretes.Employee;

@Service
public class EmployeeManager implements EmployeeService<Employee> {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public 	DataResultBase<List<Employee>> getall() {
	/*	Employee employee = new Employee();
		employee.setEmail("serdariince@aa.com");
		employee.setFirstname("Serdar");
		employee.setIdentification("1224567891");
		employee.setLastname("İNCE");
		employee.setPasswordhash("123456789");
		employee.setPasswordsalt("1234567897123");
		employee.setTelefone("5076660693");
		employee.setYear("1992");
		employeeDao.save(employee);*/
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll());
	}

	@Override
	public 	DataResultBase<Employee> add(Employee employee) {
		
		return new SuccessDataResult<Employee>(employeeDao.save(employee),Messages.employeeAdded);
	}

	@Override
	public 	DataResultBase<Employee> delete(Employee employee) {
		employeeDao.delete(employee);
		return new SuccessDataResult<Employee>(employee,Messages.employeeDelete);

	}

	@Override
	public 	DataResultBase<Employee> update(Employee employee) {
		
		return new SuccessDataResult<Employee>(employeeDao.save(employee),Messages.employeeUpdate);

	}

	@Override
	public 	DataResultBase<Employee> getById(int  id) {
		
		return new SuccessDataResult<Employee>(employeeDao.findById(id).orElse(null));

	}

}
