package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryCiclosCarreras;
import com.sga.SGA.models.CiclosCarreras;
@Service
public class CiclosCarreraService implements ICiclosCarrerasService {
	@Autowired
	private IRepositoryCiclosCarreras repoCiclos;
	@Override
	public CiclosCarreras Registrar(CiclosCarreras ciclo) {
		// TODO Auto-generated method stub
		return repoCiclos.save(ciclo);
	}

	@Override
	public CiclosCarreras Updated(CiclosCarreras ciclo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CiclosCarreras> listar() {
		// TODO Auto-generated method stub
		return repoCiclos.findAll();
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
