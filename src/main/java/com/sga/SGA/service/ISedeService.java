package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.Sede;

public interface ISedeService {
	Sede registrar(Sede sedecita);
	Sede modificar(Sede sede);
	boolean eliminar(long id);
	
	List<Sede> listar();
	
}
