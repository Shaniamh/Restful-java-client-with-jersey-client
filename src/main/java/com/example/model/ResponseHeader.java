package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"QTime"})
public class ResponseHeader {
	String zkConnected;
	long status;
	String QTime;
	Params params = new Params();
	
	public String getZkConnected() {
		return zkConnected;
	}
	public void setZkConnected(String zkConnected) {
		this.zkConnected = zkConnected;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public String getQTime() {
		return QTime;
	}
	public void setQTime(String qTime) {
		QTime = qTime;
	}
	public Params getParams() {
		return params;
	}
	public void setParams(Params params) {
		this.params = params;
	}
	
	
	
}
