package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.CursosCarreras;

public interface ICursosCarrerasService {

	CursosCarreras Registrar(CursosCarreras curso);
	CursosCarreras updated(CursosCarreras curso);
	
	List<CursosCarreras> lista();
	boolean delete(long id);
	
	List<CursosCarreras> ListarCursosPorGrupo(Long idGrupo);
	
	
	
}
