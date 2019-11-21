package com.sga.SGA.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryCalificacionAlumnoPofesor;
import com.sga.SGA.models.CalificacionAlumnoProfesor;
import com.sga.SGA.models.PerfiCalificafionProfesor;
import com.sga.SGA.models.Usuario;
@Service
public class CalificaAlumnoProfesorService implements ICalificaAlumnoProfesorService {
	@Autowired
	private IRepositoryCalificacionAlumnoPofesor repoCalificaciones;
	@Override
	public CalificacionAlumnoProfesor registraCalificacion(CalificacionAlumnoProfesor calificacion) {
		java.util.Date utilDate = new java.util.Date();
		calificacion.setFechacalificacion(new Date(utilDate.getTime()));
		// TODO Auto-generated method stub
		return repoCalificaciones.save(calificacion);
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		CalificacionAlumnoProfesor calificacion = repoCalificaciones.findById(id);
		return false;
	}

	@Override
	public List<CalificacionAlumnoProfesor> listaCalificacionPorProfesor(long idprofe) {
		// TODO Auto-generated method stub
		Usuario profe = new Usuario();
		profe.setId(idprofe);
		return repoCalificaciones.findByProfesorcalificado(profe);
	}

	@Override
	public PerfiCalificafionProfesor perfilCalificacion(long idprofe) {
		Usuario profe = new Usuario();
		profe.setId(idprofe);
		List<CalificacionAlumnoProfesor> lst =	repoCalificaciones.findByProfesorcalificado(profe);
		PerfiCalificafionProfesor perfil = null;
		if(lst.size() > 0) {
			
			
			 perfil = new PerfiCalificafionProfesor(lst);
			 
			 perfil.setListacalificaciones(null);
		
		}else {
			perfil =  null;
		}
		
		return perfil;
	}

}
