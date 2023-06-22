package com.cibertec.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import com.cibertec.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer>{

	
}
