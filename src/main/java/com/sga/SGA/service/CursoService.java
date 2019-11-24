package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryCurso;
import com.sga.SGA.models.Curso;
@Service
public class CursoService implements ICursoService {

	@Autowired
	private IRepositoryCurso repoCurso;
	
	@Override
	public Curso registra(Curso curso) {
		// TODO Auto-generated method stub
		return repoCurso.save(curso);
	}

	@Override
	public Curso update(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> lista() {
		// TODO Auto-generated method stub
		return repoCurso.findAll();
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
