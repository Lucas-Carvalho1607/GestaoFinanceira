package com.gestao.gestao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Login.Login;

@SpringBootApplication
public class GestaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoApplication.class, args);

		Login lg = new Login();
		lg.LoginGeral();
		
	}

}
