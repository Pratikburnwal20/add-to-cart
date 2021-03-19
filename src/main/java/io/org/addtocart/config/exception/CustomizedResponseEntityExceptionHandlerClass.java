package io.org.addtocart.config.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomizedResponseEntityExceptionHandlerClass extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NotfoundException.class)
	public final ResponseEntity<Object> handleExceptionNotFound(Exception ex, WebRequest request) throws Exception{
		
		ExceptionClass exception = new ExceptionClass(404,request.getDescription(false),"NOT FOUND",new Date());
		return new ResponseEntity(exception,HttpStatus.NOT_FOUND);
	}

	
}
