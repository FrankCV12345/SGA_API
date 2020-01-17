package com.sga.SGA.models;

public class ReCapchaResponse {
	private Boolean success;
	private String challenge_ts;
	private String hostname;
	
	
	public ReCapchaResponse() {
		super();
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getChallenge_ts() {
		return challenge_ts;
	}
	public void setChallenge_ts(String challenge_ts) {
		this.challenge_ts = challenge_ts;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	
	

	
	
}
