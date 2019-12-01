package com.sga.SGA.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.models.CursosCarreras;
import com.sga.SGA.models.NotasAlumno;
import com.sga.SGA.models.Usuario;
import com.sga.SGA.Repository.IRepositoryNotasAlumnos;
@Service
public class NotasAlumnoService implements INotasAlumnoService {
	@Autowired
	private IRepositoryNotasAlumnos repoNotasAlumno;
	@Override
	public NotasAlumno registra(NotasAlumno nota) {
		// TODO Auto-generated method stub
		java.util.Date utilDate = new java.util.Date();
		nota.setFechaaultimaActualizacion( new Date (utilDate.getTime()));
		return repoNotasAlumno.save(nota);
	}

	@Override
	public NotasAlumno actualizaNota(NotasAlumno nota) {
		// TODO Auto-generated method stub

		java.util.Date utilDate = new java.util.Date();
		nota.setFechaaultimaActualizacion( new Date (utilDate.getTime()));
		return null;
	}

	@Override
	public NotasAlumno NotasPorAlumnoYCuros(long idAlumno, long idCursoCarrera) {
		Usuario alumno = new Usuario();
		alumno.setId(idAlumno);
		CursosCarreras curso = new CursosCarreras();
		curso.setId(idCursoCarrera);
		return repoNotasAlumno.findByAlumnoAndCurso(alumno, curso);
		
	}

}
