package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Response {
	private long numFound;
	private long start;
	private List<Docs> docs = new ArrayList<Docs>();
	public long getNumFound() {
		return numFound;
	}
	public void setNumFound(long numFound) {
		this.numFound = numFound;
	}
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public List<Docs> getDocs() {
		return docs;
	}
	public void setDocs(List<Docs> docs) {
		this.docs = docs;
	}
	
}
