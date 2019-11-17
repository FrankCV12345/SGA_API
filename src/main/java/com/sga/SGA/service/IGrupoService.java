package com.sga.SGA.service;
import java.util.List;

import com.sga.SGA.models.Grupo;
public interface IGrupoService {
		Grupo registrar(Grupo grupo);
		Grupo modificar(Grupo grupo);
		
		boolean eliminar(long id);
		List<Grupo> listar();
}
