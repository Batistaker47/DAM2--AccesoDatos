package com.example.XMLFinalBoss.models;

public class Servlet {
	private String servletName;
	private String servletClass;
	private InitParam initParam;
	
	public Servlet(String servletName, String servletClass, InitParam initParam) {
		this.servletName = servletName;
		this.servletClass = servletClass;
		this.initParam = initParam;
	}

	public String getServletName() {
		return servletName;
	}

	public void setServletName(String servletName) {
		this.servletName = servletName;
	}

	public String getServletClass() {
		return servletClass;
	}

	public void setServletClass(String servletClass) {
		this.servletClass = servletClass;
	}

	public InitParam getInitParam() {
		return initParam;
	}

	public void setInitParam(InitParam initParam) {
		this.initParam = initParam;
	}

	@Override
	public String toString() {
		return "Servlet [servletName=" + servletName + ", servletClass=" + servletClass + ", initParam=" + initParam
				+ "]";
	}
	
	
}
