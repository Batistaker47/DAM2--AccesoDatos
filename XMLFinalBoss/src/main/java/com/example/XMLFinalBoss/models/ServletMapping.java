package com.example.XMLFinalBoss.models;

public class ServletMapping {
	private String servletName;
	private String urlPattern;
	
	public ServletMapping(String servletName, String urlPattern) {
		this.servletName = servletName;
		this.urlPattern = urlPattern;
	}
	public String getServletName() {
		return servletName;
	}
	public void setServletName(String servletName) {
		this.servletName = servletName;
	}
	public String getUrlPattern() {
		return urlPattern;
	}
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	@Override
	public String toString() {
		return "ServletMapping [servletName=" + servletName + ", urlPattern=" + urlPattern + "]";
	}
	
}
