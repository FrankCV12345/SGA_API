package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.TipoDNI;

public interface ITipoDNIservice {
	TipoDNI registrar(TipoDNI tipoDNI);
	TipoDNI actualziar(TipoDNI  tipoDNI);
	boolean eliminar(long id);
	List<TipoDNI> listar();
}
