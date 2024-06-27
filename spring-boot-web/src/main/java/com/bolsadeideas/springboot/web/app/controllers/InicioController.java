package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class InicioController {

	// 1. Un controlador tiene metodos por ejemplo para mostrar un formulario
	// consultas, guardar. eliminar etc.
	// 2. Cada uno representa una pagina web , estos se representan en una vista
	// ejemplo thymeleaf

	// 3. Aqui estamos mapeando el metodo y el url al que ira al ejecutar el metodo
	// que hjcimos
	// Usamos el get mapping ya que solamente queremos que nos de en metodo o url
	// que introdujimos

	// 4. un metodo se tiene que mapear
	// ahi puede ir el value pero como es el por defecto no es necesario ponerlo

	@GetMapping({ "/index", "/", "/home" })
	public String inicio() {

		// 5. tenemos que crear esta vista

		return "index";

	}

	// antes de hacer una sonsulta uso el mapping en este caso el get mapping

	@GetMapping("/perfil")
	public String perfil(Model model) {
		// crteo mi objeto usuario y aqui mismo le doy el resultado

		Usuario usuario = new Usuario();
		usuario.setNombre("Gildardo");
		usuario.setApellido("Ortega");
		usuario.setEmail("gildardo.ort@live.com.mx");

		// se agrega el atributo al modelo de mi objeto, un objeto puede tener varias
		// caracteristicas como nombre o apellido
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Generar Cita:".concat(usuario.getNombre()));

		return "perfil";

	}

	@GetMapping("/listarCitas")
	public String listarCitas(Model model) {
		// hacemos un arreglo para hacer la lista de usuarios
        //la lista necesita que en mi clase usuario tambien tenga un constructor
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Gildardo ", "Ortega ", "gildardo.ort@live.com.mx"));
		usuarios.add(new Usuario("Rafael ", "Leao ", "leaco@gmail.com"));
		usuarios.add(new Usuario("Cristiano ", " Ronaldo ", "cristiano@live.com.mx"));
		
		model.addAttribute("titulo", "Listado de Citas Generadas:");
		model.addAttribute("usuarios", usuarios);

		return "listarCitas";
	}

}
