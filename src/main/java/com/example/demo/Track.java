package com.example.demo;

public class Track {

	String id_user;
	String username;


	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Track [id=" + id_user + ", username=" + username + "]";
	}

}
