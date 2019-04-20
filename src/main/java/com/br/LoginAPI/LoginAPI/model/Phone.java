package com.br.LoginAPI.LoginAPI.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Phone {
	@Id
	@GeneratedValue
	private Long id;
	private int ddd;
	private String number;
	
	public Phone(int ddd, String number) {
		super();
		this.ddd = ddd;
		this.number = number;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;

	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
