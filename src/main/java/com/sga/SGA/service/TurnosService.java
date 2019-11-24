package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryTurnosCarreras;
import com.sga.SGA.models.TurnosCarreras;
@Service
public class TurnosService implements ITurnosService {
	@Autowired
	private IRepositoryTurnosCarreras repoTurnos;
	@Override
	public TurnosCarreras registrar(TurnosCarreras turno) {
		// TODO Auto-generated method stub
		return repoTurnos.save(turno);
	}

	@Override
	public TurnosCarreras update(TurnosCarreras turno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TurnosCarreras> listar() {
		// TODO Auto-generated method stub
		return repoTurnos.findAll();
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
