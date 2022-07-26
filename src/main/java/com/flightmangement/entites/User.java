package com.flightmangement.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String usertype;
	private String username;
	private String userPassword;
	private String userPhone;
	private String email;
	
	//default constructor 
	public User() {
		super();
	}
	//parameterized constructor 
	public User(int id, String usertype, String username, String userPassword, String userPhone, String email) {
		super();
		this.id = id;
		this.usertype = usertype;
		this.username = username;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.email = email;
	}
	
	//tostring methods
	@Override
	public String toString() {
		return "User [id=" + id + ", usertype=" + usertype + ", username=" + username + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
