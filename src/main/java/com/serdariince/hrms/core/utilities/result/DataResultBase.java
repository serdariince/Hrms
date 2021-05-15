package com.serdariince.hrms.core.utilities.result;

public interface DataResultBase<T>{
	boolean isSuccess();
	String getMessage();
	T data() ;

}
