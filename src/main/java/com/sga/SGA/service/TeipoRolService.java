package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryTipoRol;
import com.sga.SGA.models.TipoRol;
@Service
public class TeipoRolService implements ITipoRolService {
	
	@Autowired
	private IRepositoryTipoRol repoRol;
	@Override
	public TipoRol registrar(TipoRol tiporol) {
		// TODO Auto-generated method stub
		return repoRol.save(tiporol);
	}

	@Override
	public TipoRol modificar(TipoRol tiporol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TipoRol> listar() {
		// TODO Auto-generated method stub
		return repoRol.findAll();
	}

}
