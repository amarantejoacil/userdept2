package com.devsuperior.userdept2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept2.entities.Usuario;
import com.devsuperior.userdept2.repositorio.usuarioRepositorio;

@RestController
@RequestMapping(value = "/usuario")
public class usuarioController {
	
	@Autowired
	private usuarioRepositorio repositorio;
	
	@GetMapping
	public List<Usuario> listaTodosUsuarios(){
		List<Usuario> result = repositorio.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")//
	public Usuario listaPorId(@PathVariable Long id){
		Usuario result = repositorio.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Usuario inserirUsuario(@RequestBody Usuario usuario){
		Usuario result = repositorio.save(usuario);
		return result;
	}
	
}
