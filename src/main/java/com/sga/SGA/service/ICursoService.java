package com.sga.SGA.service;


import java.util.List;


import com.sga.SGA.models.Curso;
public interface ICursoService {
	Curso registra(Curso curso);
	
	Curso update(Curso curso);
	
	List<Curso> lista();
	boolean delete(long id);
	
	

}
