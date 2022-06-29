package com.ec2.herrera.paredes.dto;

public class UsuarioDTOResponse {
	private String token;

	public UsuarioDTOResponse(String token) {
		super();
		this.token = token;
	}

	public UsuarioDTOResponse() {
		super();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
