package com.example.JSONFinalBoss.models;

public class Glossary {
	
	private String title;
	private GlossDiv glossDiv;
	
	public Glossary(String title, GlossDiv glossDiv) {
		
		this.title = title;
		this.glossDiv = glossDiv;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public GlossDiv getGlossDiv() {
		return glossDiv;
	}
	public void setGlossDiv(GlossDiv glossDiv) {
		this.glossDiv = glossDiv;
	}
	@Override
	public String toString() {
		return "Glossary [title=" + title + ", glossDiv=" + glossDiv + "]";
	}
}
