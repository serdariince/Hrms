package com.serdariince.hrms.core.utilities.result;


public class ErrorDataResult<T> implements DataResultBase<T> {

	private  String message;
	private  boolean success;
    private T data;
    
	public ErrorDataResult() {
		this.success=false;
		
	}
	public ErrorDataResult(T data) {
		this();
		this.data=data;
	}
	public ErrorDataResult(String message) {
		this();
		this.message=message;
	}
	public ErrorDataResult(T data,String message) {
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
	public T data() {
		return this.data;
	}

}
