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
		Curso UpdatedCurso =  repoCurso.findById(curso.getId());
		if(UpdatedCurso != null) {
			return repoCurso.save(curso);
		}else {
			return null;
		}
		
	}

	@Override
	public List<Curso> lista() {
		// TODO Auto-generated method stub
		return repoCurso.findBySfotdelete(false);
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		Curso curso = repoCurso.findById(id);
		if(curso != null) {
			curso.setSfotdelete(true);
			repoCurso.save(curso);
			return true;
		}else {
			return false;
		}
	}

}
