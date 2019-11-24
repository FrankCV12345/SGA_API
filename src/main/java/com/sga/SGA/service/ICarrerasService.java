package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.Carreras;

public interface ICarrerasService {
	Carreras Registra(Carreras carrera);
	Carreras update(Carreras carrera);
	List<Carreras> lista();
	boolean delete(long id);
	
}
