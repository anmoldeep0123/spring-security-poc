package com.example.demo.payload;

/**
 * Created by rajeevkumarsingh on 19/08/17.
 */
public class JWTAuthenticationResponse {
	private String accessToken;
	private String tokenType = "Bearer";

	public JWTAuthenticationResponse(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
}