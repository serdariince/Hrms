package com.serdariince.hrms.core.utilities.result;

public interface DataResultBase<Object>{
	boolean isSuccess();
	String getMessage();
	Object data() ;

}
