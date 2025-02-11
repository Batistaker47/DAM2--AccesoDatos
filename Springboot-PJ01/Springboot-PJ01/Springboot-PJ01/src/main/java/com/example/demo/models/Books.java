package com.example.demo.models;

public class Books {
	
	private String title;
	private String author;
	private String year;
	
	public Books(String title, String author, String year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book title: " + title + ", author: " + author + ", year: " + year;
	}
	
	

}
