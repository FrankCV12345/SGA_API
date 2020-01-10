package com.sga.SGA.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.models.CursosCarreras;
import com.sga.SGA.models.GrupoYCursoPorProfesor;
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
		
		//repoNotasAlumno.findById(id)
		NotasAlumno notas = repoNotasAlumno.findByAlumnoAndCurso(nota.getAlumno(), nota.getCurso());
		java.util.Date utilDate = new java.util.Date();
		nota.setFechaaultimaActualizacion( new Date (utilDate.getTime()));
		if(notas == null) {
			return repoNotasAlumno.save(nota);
		}else {
			if(notas.getNota1() == null) {
				notas.setNota1(nota.getNota1());
			}else if(notas.getNota2() == null) {
				notas.setNota2(nota.getNota2());
				
			}else if(notas.getNota3() ==  null) {
				notas.setNota3(nota.getNota3());
			}else if(notas.getExamenfinal() == null) {
				notas.setExamenfinal(nota.getExamenfinal());
			}
			if(notas.getExamenfinal() != null) {
				Double promedioFinal = (notas.getNota1() * 0.04)+ (notas.getNota1()* 0.12) +  (notas.getNota1() * 0.24) + (notas.getNota1() * 0.6);
				
				if(promedioFinal >= 13) {
					notas.setEstadoaprobado("Aprobado");
				}else {
					notas.setEstadoaprobado("Desaprobado");
				}
				
			}
			/*
			notas.setNota1(nota.getNota1());
			notas.setNota2(nota.getNota2());
			notas.setNota3(nota.getNota3());
			notas.setExamenfinal(nota.getExamenfinal());
			*/
			return repoNotasAlumno.save(notas);
		}
		
		
		
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

	@Override
	public List<GrupoYCursoPorProfesor> ListaCursosPorseccionParaProfesor(long idprofesor) {
		List<GrupoYCursoPorProfesor> lista = new ArrayList<>();
		List<Object[]> listaObjeto=repoNotasAlumno.ListaCursosPorGrupoParaProfesor(idprofesor);
		for(Object[] obj : listaObjeto) {
			GrupoYCursoPorProfesor instancia = new GrupoYCursoPorProfesor(
					Long.parseLong( obj[0].toString()),
					Long.parseLong(obj[1].toString()),
					obj[2].toString()
					);
			lista.add(instancia);
		}
		
		return lista;
	}

}
