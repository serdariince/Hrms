package com.serdariince.hrms.core.utilities.result;

public class SuccessDataResult<T> implements DataResultBase<T> {

	private  String message;
	private  boolean success;
    private T data;
    
	public SuccessDataResult() {
		this.success=true;

	}
	public SuccessDataResult(T data) {
		this();
		this.data=data;
	}
	public SuccessDataResult(String message) {
		this();
		this.message=message;
	}
	public SuccessDataResult(T data,String message) {
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
