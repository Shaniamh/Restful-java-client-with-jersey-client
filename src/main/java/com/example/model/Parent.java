package com.example.model;

import com.example.model.ResponseHeader;
import com.example.model.Response;
public class Parent {
	private ResponseHeader responseHeader = new ResponseHeader();
	private Response response = new Response();
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	
	
}
