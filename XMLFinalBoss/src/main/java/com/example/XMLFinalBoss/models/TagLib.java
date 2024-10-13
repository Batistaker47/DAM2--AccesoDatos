package com.example.XMLFinalBoss.models;

public class TagLib {
	private String tagLibUri;
	private String tagLibLocation;
	
	public TagLib(String tagLibUri, String tagLibLocation) {
		this.tagLibUri = tagLibUri;
		this.tagLibLocation = tagLibLocation;
	}
	public String getTagLibUri() {
		return tagLibUri;
	}
	public void setTagLibUri(String tagLibUri) {
		this.tagLibUri = tagLibUri;
	}
	public String getTagLibLocation() {
		return tagLibLocation;
	}
	public void setTagLibLocation(String tagLibLocation) {
		this.tagLibLocation = tagLibLocation;
	}
	@Override
	public String toString() {
		return "TagLib [tagLibUri=" + tagLibUri + ", tagLibLocation=" + tagLibLocation + "]";
	}
	
}
