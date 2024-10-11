package com.example.JSONFinalBoss.models;


public class GlossEntry {
	private String id;
	private String sortAs;
	private String glossTerm;
	private String acronym;
	private String abrevv;
	private GlossDef glossDef;
	private String glossSee;
	
	public GlossEntry(String id, String sortAs, String glossTerm, String acronym, String abrevv,
			GlossDef glossDef, String glossSee) {
		this.id = id;
		this.sortAs = sortAs;
		this.glossTerm = glossTerm;
		this.acronym = acronym;
		this.abrevv = abrevv;
		this.glossDef = glossDef;
		this.glossSee = glossSee;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSortAs() {
		return sortAs;
	}

	public void setSortAs(String sortAs) {
		this.sortAs = sortAs;
	}

	public String getGlossTerm() {
		return glossTerm;
	}

	public void setGlossTerm(String glossTerm) {
		this.glossTerm = glossTerm;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getAbrevv() {
		return abrevv;
	}

	public void setAbrevv(String abrevv) {
		this.abrevv = abrevv;
	}

	public GlossDef getGlossDef() {
		return glossDef;
	}

	public void setGlossDefList(GlossDef glossDef) {
		this.glossDef = glossDef;
	}

	public String getGlossSee() {
		return glossSee;
	}

	public void setGlossSee(String glossSee) {
		this.glossSee = glossSee;
	}

	@Override
	public String toString() {
		return "GlossEntry [id=" + id + ", sortAs=" + sortAs + ", glossTerm=" + glossTerm + ", acronym=" + acronym
				+ ", abrevv=" + abrevv + ", glossDef=" + glossDef + ", glossSee=" + glossSee + "]";
	}
	
	
}
