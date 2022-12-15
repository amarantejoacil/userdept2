package com.devsuperior.userdept2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept2.entities.Usuario;

public interface usuarioRepositorio extends JpaRepository<Usuario, Long>{
	
}
