package com.info7255.demo.model;

public class AuthResponse {

	public AuthResponse(String Token) {
		super();
		this.Token = Token;
	}

	private String Token;

	public String getToken() {
		return Token;
	}

	public void setToken(String Token) {
		this.Token = Token;
	}

}
