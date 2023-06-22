package com.cibertec.entity;



import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "usuario")
public class Usuario {

	private int idUsuario;
	private String nombres ;
	private String password ;
	private Date fechaNacimiento ;
	private int estado ;
	private String email;
	private String materno;
	private String numeroDocumento;
	private String paterno;
	private String telefono;
	private int idTipoDocumento;
	
	

	
	
	
}



