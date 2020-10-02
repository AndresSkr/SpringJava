package com.example.demo.Response;

public class Response {
	
	private String Message;
	private boolean status;
	private Object response;
	
	public Response(String message, boolean status) {
		Message = message;
		this.status = status;
	}

	public Response() {
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
	
	

}
