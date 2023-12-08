package com.satyam.spring.spring_core.wsclient;

public class WSClient {

	private String url;
	private String userName;
	private String password;

	public WSClient(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "WSClient [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}
