package com.in28minutes.microservices.limitsservice.beans;

public class LimitConfiguration {
	
	private int minimum;
	private int maximunm;
	
	protected LimitConfiguration() {
	}
	
	public LimitConfiguration(int minimum, int maximunm) {
		super();
		this.minimum = minimum;
		this.maximunm = maximunm;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximunm() {
		return maximunm;
	}
	public void setMaximunm(int maximunm) {
		this.maximunm = maximunm;
	}

	@Override
	public String toString() {
		return "LimitConfiguration [minimum=" + minimum + ", maximunm=" + maximunm + "]";
	}
	
	
	
}
