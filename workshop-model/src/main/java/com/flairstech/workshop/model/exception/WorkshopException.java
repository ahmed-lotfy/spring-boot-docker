package com.flairstech.workshop.model.exception;

public class WorkshopException extends RuntimeException {
	private Integer code;
	private Integer httpCode;
	private String errorMessage;

	public WorkshopException(Integer code, String errorMessage) {
		super();
		this.code = code;
		this.errorMessage = errorMessage;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
