package com.in28minutes.microservice.currencyexchangeservice.bean;

public class TestResponse {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "TestResponse [msg=" + msg + "]";
	}

	public TestResponse(String msg) {
		super();
		this.msg = msg;
	}
	
	
	
}
