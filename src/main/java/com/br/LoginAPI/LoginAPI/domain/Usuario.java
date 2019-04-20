package com.br.LoginAPI.LoginAPI.domain;

import java.util.List;

import com.br.LoginAPI.LoginAPI.model.Phone;

public class Usuario {
	private Long id;
	private String name;
	private String password;
	private String email;
	private boolean isAtivo;
	List<Phone> phones;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String name, String password, String email, boolean isAtivo,List<Phone> phones) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.isAtivo = isAtivo;
		this.phones = phones;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSenha() {
		return password;
	}

	public void setSenha(String senha) {
		this.password = senha;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
}
