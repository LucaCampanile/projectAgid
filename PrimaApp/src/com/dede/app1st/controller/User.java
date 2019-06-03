package com.dede.app1st.controller;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "USERS")

public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id", nullable=false, unique=true)
	private int id;
	@Column(name="firstname", length=40, nullable=false)
private String firstname;
	@Column(name="lastname", length=40, nullable=false)
private String lastname;
	@Column(name="country", length=40, nullable=true)
private String country;

public User(String fn, String ln, String country) {
	
	firstname = fn;
	lastname = ln;
	this.country = country;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

}
