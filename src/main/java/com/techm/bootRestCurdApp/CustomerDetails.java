package com.techm.bootRestCurdApp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customerDetails")
public class CustomerDetails {
	@Id
	public int _id;
	public String fname;
	public String lname;
	public String email;
	public String mobile;
	public String city;
	public String state;
	public String country;
	public String pincode;

	// Constructors
	public CustomerDetails() {
		super();
	}
	
	public CustomerDetails(int _id, String fname, String lname, String email, String mobile, String city, String state, String country, String pincode) {
		super();
		this._id = _id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	//Setters and Getters
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
