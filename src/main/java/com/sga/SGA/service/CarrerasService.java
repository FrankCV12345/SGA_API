package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryCarreras;
import com.sga.SGA.models.Carreras;
@Service
public class CarrerasService implements ICarrerasService {
	
	@Autowired
	private IRepositoryCarreras repoCarreras;
	
	@Override
	public Carreras Registra(Carreras carrera) {
		// TODO Auto-generated method stub
		return repoCarreras.save(carrera);
	}

	@Override
	public Carreras update(Carreras carrera) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carreras> lista() {
		// TODO Auto-generated method stub
		return repoCarreras.findAll();
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}


}
