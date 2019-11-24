package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryModialidad;
import com.sga.SGA.models.modalida;
@Service
public class ModalidadService implements IModalidadService {

	@Autowired
	private IRepositoryModialidad ModalidaRepol;
	
	
	@Override
	public modalida registrar(modalida modalidad) {
		// TODO Auto-generated method stub
		return ModalidaRepol.save(modalidad);
	}

	@Override
	public modalida updated(modalida modalidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<modalida> listar() {
		// TODO Auto-generated method stub
		return ModalidaRepol.findAll();
	}

	@Override
	public boolean elimina(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
