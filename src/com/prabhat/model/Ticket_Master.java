package com.prabhat.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket_Master {
	@Id @GeneratedValue
	private int ticketid;
	private String loggerid;
	private  Date date;
	private String logger_name;
	private String priority;
	private String seviority;
	
	public Ticket_Master() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ticket_Master(int ticketid, String loggerid, Date date,
			String loggerName, String priority, String seviority) {
		super();
		this.ticketid = ticketid;
		this.loggerid = loggerid;
		this.date = date;
		logger_name = loggerName;
		this.priority = priority;
		this.seviority = seviority;
	}

	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getLoggerid() {
		return loggerid;
	}
	public void setLoggerid(String loggerid) {
		this.loggerid = loggerid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLogger_name() {
		return logger_name;
	}
	public void setLogger_name(String loggerName) {
		logger_name = loggerName;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSeviority() {
		return seviority;
	}
	public void setSeviority(String seviority) {
		this.seviority = seviority;
	}
	
	

}
