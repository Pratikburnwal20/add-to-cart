package io.org.addtocart.responseclass;

import org.springframework.http.HttpStatus;

public class ResponseClass<T> {

	private HttpStatus status;
	private T response;
	private String uri;
	
	public ResponseClass(HttpStatus status, T response, String uri) {
		super();
		this.status = status;
		this.response = response;
		this.uri = uri;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
	
	