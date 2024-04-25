package com.smart.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String name;
	@Column(unique=true)
	private String email;
	private String password;
	private String role;
	private boolean enbled;
	private String imageurl;
	@Column(length=500)
	private String about;
	
	
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.LAZY)
	private List<contact> contacts=new ArrayList<>();
	 
	
	
	public User() {
		
	 super();
		 
	 
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isEnbled() {
		return enbled;
	}


	public void setEnbled(boolean enbled) {
		this.enbled = enbled;
	}


	public String getImageurl() {
		return imageurl;
	}


	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}


	public String getAbout() {
		return about;
	}


	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
