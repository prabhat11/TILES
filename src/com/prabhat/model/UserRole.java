package com.prabhat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Roll_Master")
public class UserRole {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String rolename;
	private String roledisc;
	private String activStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRoledisc() {
		return roledisc;
	}
	public void setRoledisc(String roledisc) {
		this.roledisc = roledisc;
	}
	public String getActivStatus() {
		return activStatus;
	}
	public void setActivStatus(String activStatus) {
		this.activStatus = activStatus;
	}
	

}
