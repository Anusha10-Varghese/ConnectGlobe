package com.virtusa.Main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Report")
public class Report {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String country;
	private String yourReport;
	private String status;
	
	
	public Report() {
		super();
	}
	public Report(int id, String username, String country, String yourReport, String status) {
		super();
		this.id = id;
		this.username = username;
		this.country = country;
		this.yourReport = yourReport;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getYourReport() {
		return yourReport;
	}
	public void setYourReport(String yourReport) {
		this.yourReport = yourReport;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
