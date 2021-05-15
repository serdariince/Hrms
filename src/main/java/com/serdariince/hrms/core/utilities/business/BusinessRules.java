package com.serdariince.hrms.core.utilities.business;

import com.serdariince.hrms.core.utilities.result.ResultBase;

public class BusinessRules {
	 public static ResultBase Run(ResultBase[] logics)
     {
		 for (ResultBase logic : logics)
         {
             if (!logic.isSuccess())
             {
                 return logic;
             }
         }

         return null;
}
	 }
