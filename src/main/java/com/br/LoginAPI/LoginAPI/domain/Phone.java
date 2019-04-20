package com.br.LoginAPI.LoginAPI.domain;

public class Phone {
	private Long id;
	private int ddd;
	private String number;
	
	public Phone(int ddd, String number,Long id) {
		super();
		this.ddd = ddd;
		this.number = number;
		this.id = id;
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
