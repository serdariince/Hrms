package com.serdariince.hrms.core.api;

import java.util.List;




public interface BaseControllers<T> {

	List<T> getall();
	T add (T data);
	T update (T data);
	T delete (T data);
	T getById (int id);
	


}
