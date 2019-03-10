package com.flairstech.workshop.common.error;

import com.flairstech.workshop.model.WorkshopResponseError;
import com.flairstech.workshop.model.exception.WorkshopException;
import com.flairstech.workshop.model.exception.WorkshopExceptionConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({WorkshopException.class})
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected Object handleWorkshopExceptions(WorkshopException exception, WebRequest request) {
		WorkshopResponseError responseError = new WorkshopResponseError();
		responseError.setErrorMessage(exception.getErrorMessage());
		responseError.setCode(exception.getCode());
		responseError.setHttpStatusCode(exception.getHttpCode());
		return ResponseEntity.status(exception.getHttpCode()).body(responseError);
	}

	@ExceptionHandler({Exception.class})
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected Object handleGeneralExceptions(Exception e, WebRequest request) {
		WorkshopResponseError responseError = new WorkshopResponseError();
		responseError.setErrorMessage(WorkshopExceptionConstant.INTERNAL_ERROR.getDesc());
		responseError.setCode(WorkshopExceptionConstant.INTERNAL_ERROR.getCode());
		responseError.setHttpStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(responseError);
	}
}
