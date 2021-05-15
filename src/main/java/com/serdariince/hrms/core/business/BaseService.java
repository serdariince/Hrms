package com.serdariince.hrms.core.business;

import java.util.List;

import com.serdariince.hrms.core.utilities.result.DataResultBase;


public interface BaseService<T> {
	DataResultBase<List<T>> getall ();
	DataResultBase<T> add(T entity);
	DataResultBase<T> delete(T entity);
	DataResultBase<T> update(T entity);
	DataResultBase<T> getById (int id);
}
