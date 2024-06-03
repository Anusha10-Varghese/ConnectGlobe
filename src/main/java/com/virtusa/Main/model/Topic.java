package com.virtusa.Main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Topic")
public class Topic {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String title;
	private String hint;
	
	
	public Topic() {
		super();
	}
	public Topic(int id, String title, String hint) {
		super();
		this.id = id;
		this.title = title;
		this.hint = hint;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	
	
}
