package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.CiclosCarreras;

public interface ICiclosCarrerasService {
	
	CiclosCarreras Registrar(CiclosCarreras ciclo);
	CiclosCarreras Updated(CiclosCarreras ciclo);
	List<CiclosCarreras> listar();
	boolean delete(long id);
	
}
