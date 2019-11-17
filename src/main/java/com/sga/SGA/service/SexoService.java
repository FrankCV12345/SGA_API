package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositorySexo;
import com.sga.SGA.models.TipoSexo;

@Service
public class SexoService implements ITipoSexoService {

	@Autowired
	private IRepositorySexo repoSexo;
	
	@Override
	public TipoSexo resgistrar(TipoSexo tipoSexo) {
		// TODO Auto-generated method stub
		return repoSexo.save(tipoSexo);
	}

	@Override
	public TipoSexo modificar(TipoSexo tipoSexo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TipoSexo> listar() {
		// TODO Auto-generated method stub
		return repoSexo.findAll();
	}

}
