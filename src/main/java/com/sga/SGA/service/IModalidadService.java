package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.modalida;

public interface IModalidadService {
	
	
	modalida registrar(modalida modalidad );
	
	modalida updated(modalida modalidad);
	
	List<modalida> listar();
	boolean elimina(long id);

}
