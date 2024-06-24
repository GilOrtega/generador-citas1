package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class InicioController {

	//  1. Un controlador tiene metodos por ejemplo para mostrar un formulario consultas, guardar. eliminar etc.
    // 2. Cada uno representa una pagina web , estos se representan en una vista ejemplo thymeleaf 
	
	//3. Aqui estamos mapeando el metodo y el url al que ira al ejecutar el metodo que hjcimos 
	//Usamos el get mapping ya que solamente queremos que nos de en metodo o url que introdujimos 
	
	//4. un metodo se tiene que mapear 
	//ahi puede ir el value pero como es el por defecto no es necesario ponerlo 
	
	
	
	@GetMapping({"/index", "/", "/home"})
	public String inicio() {
		
		//5. tenemos que crear esta vista 
		
		//prueba con .git 
		
		return "index";
		
		
	}
	
	
}
