package com.br.LoginAPI.LoginAPI.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.LoginAPI.LoginAPI.model.*;
import com.br.LoginAPI.LoginAPI.service.*;

@RestController
public class UsuarioController {
	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
		return usuarioService.getAllUsuarios();	
	}
	
	 @RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	    public Usuario getUsuario(@PathVariable("id") long id) {
		 	return usuarioService.getUsuarioById(id);
	 }
	 @RequestMapping(value = "/usuario", method = RequestMethod.POST)
	    public Usuario createUsuario(@RequestBody Usuario usuario ) {
		 	return usuarioService.save(usuario);
		 	
	 }

}
