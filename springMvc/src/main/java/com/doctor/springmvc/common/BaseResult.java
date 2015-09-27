package com.doctor.springmvc.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author doctor
 *
 * @time 2015年9月27日
 */
public class BaseResult implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<String, String> errorInfo;
	private boolean success;

	public BaseResult() {
		errorInfo = new HashMap<>();
		success = true;
	}

	public BaseResult withError(String errorCode, String errorMessage) {
		if (success) {
			success = false;
		}
		errorInfo.put(errorCode, errorMessage);
		return this;
	}

	public Map<String, String> getErrorInfo() {
		return errorInfo;
	}

	public boolean isSuccess() {
		return success;
	}

}
