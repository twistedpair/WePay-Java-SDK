package com.lookfirst.wepay;

import lombok.Getter;

/**
 * The possible errors that are generated by wepay itself
 * 
 * https://stage.wepay.com/developer/reference/errors 
 */
public class WePayException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/** The raw error type string */
	@Getter
	String error;
	
	/** The error string converted to a known enum, or null if unknown */
	@Getter
	WePayError errorType;
	
	/** */
	public WePayException(String error, String errorDescription) {
		super(error + ": " + errorDescription);
		
		this.error = error;
		
		// If wepay adds a new error, we won't have it registered
		try {
			errorType = WePayError.valueOf(error);
		} catch (Exception ex) {}
	}
}