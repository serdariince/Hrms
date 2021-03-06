package com.serdariince.hrms.core.utilities.result;


public class SuccessDataResult<Object> implements DataResultBase<Object> {

	private  String message;
	private  boolean success;
    private Object data;
    
	public SuccessDataResult() {
		this.success=true;

	}
	public SuccessDataResult(Object data) {
		this();
		this.data=data;
	}
	public SuccessDataResult(String message) {
		this();
		this.message=message;
	}
	public SuccessDataResult(Object data,String message) {
		this(data);
		this.message=message;
	}
    @Override
	public boolean isSuccess() {
		return this.success;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public Object data() {
		return data ;
	}

}
