package com.samco.model;

public class User {
private int userid;
private String username;
private String email;
private String dob;
public User(int userid, String username,String email,String dob) {
	super();
	this.userid = userid;
	this.username = username;
	this.email = email;
	this.dob = dob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

}
