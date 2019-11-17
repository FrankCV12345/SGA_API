package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.TipoRol;

public interface ITipoRolService {
	
	TipoRol registrar(TipoRol tiporol);
	TipoRol modificar(TipoRol tiporol);
	
	boolean eliminar(long id);
	
	List<TipoRol> listar();
	

}
