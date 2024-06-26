package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;


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
		
		return "index";
		
		
	}
	
	//antes de hacer una sonsulta uso el mapping en este caso el get mapping 
	
	@GetMapping("/perfil")
	public String perfil (Model model) {
		//crteo mi objeto usuario y aqui mismo le doy el resultado 
		
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Gildardo");
	    usuario.setApellido("Ortega");
		
		//se agrega el atributo al modelo de mi objeto, un objeto puede tener varias caracteristicas como nombre o apellido 
		model.addAttribute("usuario", usuario);
		return "perfil";
		
	}
	
	
}
