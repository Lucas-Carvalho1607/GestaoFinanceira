package com.gestao.gestao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Menus.Menu_Gerente;

@SpringBootApplication
public class GestaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoApplication.class, args);

		Menu_Gerente menu = new Menu_Gerente();
		 
		
	}

}
