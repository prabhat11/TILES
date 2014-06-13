package com.prabhat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class UserAddress {
	 @Id @GeneratedValue
	private int sId;
	private String state;
	private String city;
	private String pin;
	
	
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserAddress(String state, String city, String pin) {
		super();
		this.state = state;
		this.city = city;
		this.pin = pin;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	

}
