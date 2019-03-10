package com.flairstech.workshop.model.exception;

public enum WorkshopExceptionConstant {

	INTERNAL_ERROR(1001, "Internal Server Error"),
	INVALID_COUNTRY_CODE(1002, "Invalid Country Code");

	private final int code;
	private final String desc;

	private WorkshopExceptionConstant(final int code, final String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
