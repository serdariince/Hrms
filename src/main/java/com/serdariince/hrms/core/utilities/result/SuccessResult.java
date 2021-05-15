package com.serdariince.hrms.core.utilities.result;


public class SuccessResult  implements ResultBase {

	

	private boolean success;
    private String message ;
    

    
    public SuccessResult( )
    {    	 
        this.success = true;
    }
	 public SuccessResult(String message)
    {
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
