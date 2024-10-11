package com.example.JSONFinalBoss.models;

import java.util.ArrayList;

public class GlossDef {
	
	private String para;
	private ArrayList<String> glossSeeAlsoList;
	
	public GlossDef(String para, ArrayList<String> glossSeeAlsoList) {
		this.para = para;
		this.glossSeeAlsoList = glossSeeAlsoList;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public ArrayList<String> getGlossSeeAlsoList() {
		return glossSeeAlsoList;
	}

	public void setGlossSeeAlsoList(ArrayList<String> glossSeeAlsoList) {
		this.glossSeeAlsoList = glossSeeAlsoList;
	}

	@Override
	public String toString() {
		return "GlossDef [para=" + para + ", glossSeeAlsoList=" + glossSeeAlsoList + "]";
	}
	
}
