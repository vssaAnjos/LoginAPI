package com.br.LoginAPI.LoginAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.LoginAPI.LoginAPI.model.*;
import com.br.LoginAPI.LoginAPI.repository.*;

@Service("IUsuarioService")
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	IUsuarioRepository usuarioRepository;
	
	@Override
	public Usuario getUsuarioById(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}
	

}