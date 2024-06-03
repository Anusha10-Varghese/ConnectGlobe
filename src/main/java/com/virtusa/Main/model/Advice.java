package com.virtusa.Main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "advice")
public class Advice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String text;
	
	
	public Advice() {
		super();
	}
	public Advice(int id, String username, String text) {
		super();
		this.id = id;
		this.username = username;
		this.text = text;
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	

}
