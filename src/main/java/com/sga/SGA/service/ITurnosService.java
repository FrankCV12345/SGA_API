package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.TurnosCarreras;

public interface ITurnosService {
	TurnosCarreras registrar(TurnosCarreras turno);
	TurnosCarreras update(TurnosCarreras turno);
	List<TurnosCarreras> listar();
	boolean delete(long id);
}
