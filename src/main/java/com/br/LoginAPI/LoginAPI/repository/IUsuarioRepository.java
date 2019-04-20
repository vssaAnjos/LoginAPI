package com.br.LoginAPI.LoginAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.LoginAPI.LoginAPI.model.*;
@Repository("IUsuarioRepository")
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
