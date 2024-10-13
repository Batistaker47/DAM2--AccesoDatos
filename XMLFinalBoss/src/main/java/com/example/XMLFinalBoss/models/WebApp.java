package com.example.XMLFinalBoss.models;

public class WebApp {
	private Servlet servlet;
	private ServletMapping servletMapping;
	private TagLib tagLib;
	
	public WebApp(Servlet servlet, ServletMapping servletMapping, TagLib tagLib) {
		this.servlet = servlet;
		this.servletMapping = servletMapping;
		this.tagLib = tagLib;
	}

	public Servlet getServlet() {
		return servlet;
	}

	public void setServlet(Servlet servlet) {
		this.servlet = servlet;
	}

	public ServletMapping getServletMapping() {
		return servletMapping;
	}

	public void setServletMapping(ServletMapping servletMapping) {
		this.servletMapping = servletMapping;
	}

	public TagLib getTagLib() {
		return tagLib;
	}

	public void setTagLib(TagLib tagLib) {
		this.tagLib = tagLib;
	}

	@Override
	public String toString() {
		return "WebApp [servlet=" + servlet + ", servletMapping=" + servletMapping + ", tagLib=" + tagLib + "]";
	}
	
}
