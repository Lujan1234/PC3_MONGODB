package com.cibertec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Usuario;
import com.cibertec.service.UsuarioService;

@RestController
@RequestMapping("/rest/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping()
	public ResponseEntity<?>  lista(){
		List<Usuario> lstSalida = service.listaUsuario();
		return ResponseEntity.ok(lstSalida);
	}
	
}






