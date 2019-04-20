package com.br.LoginAPI.LoginAPI.service;
import java.util.List;
import com.br.LoginAPI.LoginAPI.model.*;

public interface IUsuarioService {

	Usuario getUsuarioById(Long id);
	List<Usuario> getAllUsuarios();
	Usuario save(Usuario usuario);
}
