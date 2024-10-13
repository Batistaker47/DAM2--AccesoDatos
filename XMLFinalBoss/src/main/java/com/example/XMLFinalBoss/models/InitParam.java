package com.example.XMLFinalBoss.models;

public class InitParam {
	private String paramName;
	private String paramValue;
	
	public InitParam(String paramName, String paramValue) {
		this.paramName = paramName;
		this.paramValue = paramValue;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	@Override
	public String toString() {
		return "InitParam [paramName=" + paramName + ", paramValue=" + paramValue + "]";
	}
	
	
	
}
