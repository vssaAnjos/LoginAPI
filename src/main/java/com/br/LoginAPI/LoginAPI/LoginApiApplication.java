package com.br.LoginAPI.LoginAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.br.LoginAPI.LoginAPI.model.Usuario;
import com.br.LoginAPI.LoginAPI.repository.*;


@SpringBootApplication
public class LoginApiApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoginApiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(IUsuarioRepository usuarioRepository) {
		return (args) -> {
		//	usuarioRepository.save(new Usuario("coelho","senha",(long) 123456,true));
			//usuarioRepository.save(new Usuario("jorge", "senha1", (long) 123456, false));			
			logger.info("The sample data has been generated");
		};
}

} //
