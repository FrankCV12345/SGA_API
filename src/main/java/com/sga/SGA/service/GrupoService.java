package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryGrupo;
import com.sga.SGA.models.Grupo;


@Service
public class GrupoService implements IGrupoService {
	
	
	@Autowired
	private IRepositoryGrupo repoGrupo;

	@Override
	public Grupo registrar(Grupo grupo) {
		// TODO Auto-generated method stub
		return repoGrupo.save(grupo);
	}

	@Override
	public Grupo modificar(Grupo grupo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Grupo> listar() {
		// TODO Auto-generated method stub
		return repoGrupo.findAll();
	}

}
