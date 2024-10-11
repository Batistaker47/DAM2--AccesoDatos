package com.example.JSONFinalBoss.models;

public class GlossDiv {
	private String title;
	private GlossEntry glossEntry;
	
	public GlossDiv(String title, GlossEntry glossEntry) {
		this.title = title;
		this.glossEntry = glossEntry;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public GlossEntry getGlossEntry() {
		return glossEntry;
	}

	public void setGlossEntryList(GlossEntry glossEntry) {
		this.glossEntry = glossEntry;
	}

	@Override
	public String toString() {
		return "GlossDiv [title=" + title + ", glossEntry=" + glossEntry + "]";
	}
	
}
