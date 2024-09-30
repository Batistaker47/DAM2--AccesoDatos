package com.example.LecturaEscrituraXLSXtxt.models;

public class Data {
	
	private String hour;
	private String day;
	private String subject;
	
	
	public Data(String hour, String day, String subject) {
		this.hour = hour;
		this.day = day;
		this.subject = subject;
	}
	
	public Data() {
		
	}


	public String getHour() {
		return hour;
	}


	public void setHour(String hour) {
		this.hour = hour;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Data [hour=" + hour + ", day=" + day + ", subject=" + subject + "]";
	}
	
	
	
	
	
}
