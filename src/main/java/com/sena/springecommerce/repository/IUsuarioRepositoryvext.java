package com.sena.springecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.springecommerce.model.Usuario;

@Repository
public interface IUsuarioRepositoryvext extends JpaRepository<Usuario, Integer> {
	
	Optional<Usuario> findByEmailOptional(String email);

}
