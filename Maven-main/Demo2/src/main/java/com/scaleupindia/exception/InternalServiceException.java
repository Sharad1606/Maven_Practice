package com.scaleupindia.exception;

/**
 * @author sharad1606
 *
 */
public class InternalServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InternalServiceException(String message) {
		super(message);
	}
}
