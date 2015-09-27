package com.doctor.springmvc.common.exception;

public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = "This is an exception..";

	public CustomException(String message) {
		super(message);
	}

}
