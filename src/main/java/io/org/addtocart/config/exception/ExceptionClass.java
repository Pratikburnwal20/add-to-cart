package io.org.addtocart.config.exception;

import java.util.Date;

public class ExceptionClass {

	private int statuscode;
	private String message;
	private String details;
	private Date timestamp;

	public ExceptionClass(int statuscode, String message, String details, Date timestamp) {
		super();
		this.statuscode = statuscode;
		this.message = message;
		this.details = details;
		this.timestamp = timestamp;
	}

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
