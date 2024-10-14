package com.example.XMLFinalBoss.models;

import java.util.ArrayList;

public class WebApp {
	private ArrayList<Servlet> servlet;
	private ArrayList<ServletMapping> servletMapping;
	private ArrayList<TagLib> tagLib;
	
	public WebApp(ArrayList<Servlet> servlet, ArrayList<ServletMapping> servletMapping, ArrayList<TagLib> tagLib) {
		this.servlet = servlet;
		this.servletMapping = servletMapping;
		this.tagLib = tagLib;
	}

	public ArrayList<Servlet> getServlet() {
		return servlet;
	}

	public void setServlet(ArrayList<Servlet> servlet) {
		this.servlet = servlet;
	}

	public ArrayList<ServletMapping> getServletMapping() {
		return servletMapping;
	}

	public void setServletMapping(ArrayList<ServletMapping> servletMapping) {
		this.servletMapping = servletMapping;
	}

	public ArrayList<TagLib> getTagLib() {
		return tagLib;
	}

	public void setTagLib(ArrayList<TagLib> tagLib) {
		this.tagLib = tagLib;
	}

	@Override
	public String toString() {
		return "WebApp [servlet=" + servlet + ", servletMapping=" + servletMapping + ", tagLib=" + tagLib + "]";
	}
	
}
