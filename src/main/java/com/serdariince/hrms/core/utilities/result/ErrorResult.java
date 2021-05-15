package com.serdariince.hrms.core.utilities.result;

public class ErrorResult implements  ResultBase {
	private final boolean success;
	private String message;
	
	public ErrorResult() {
		this.success = false;
	}
		
	public ErrorResult(String message) {
		this();
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}

}
