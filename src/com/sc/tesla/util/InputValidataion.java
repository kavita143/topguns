package com.sc.tesla.util;

public class InputValidataion {
	
	
	public static boolean idValidation(String id) {

		String pattern= "^[1-9]{1}[0-9]{4}$";
		
		
		if(id.matches(pattern)) 
			return true;
		else
			return false;
		
	}

}
