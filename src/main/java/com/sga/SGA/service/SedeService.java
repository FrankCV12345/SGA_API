package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositorySede;
import com.sga.SGA.models.Sede;

@Service
public class SedeService implements ISedeService {

	@Autowired
	private IRepositorySede repoSede;
	
	@Override
	public Sede registrar(Sede sedecita) {
		// TODO Auto-generated method stub
		sedecita.setSoftDelete(false);
		return repoSede.save(sedecita);
	}

	@Override
	public Sede modificar(Sede sede) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Sede> listar() {
		// TODO Auto-generated method stub
		return repoSede.findAll();
	}

}
