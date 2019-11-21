package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.CalificacionAlumnoProfesor;
import com.sga.SGA.models.PerfiCalificafionProfesor;

public interface ICalificaAlumnoProfesorService {
	CalificacionAlumnoProfesor registraCalificacion(CalificacionAlumnoProfesor calificacion);
	boolean eliminar(long id);
	List<CalificacionAlumnoProfesor> listaCalificacionPorProfesor(long idprofe );
	PerfiCalificafionProfesor perfilCalificacion(long idprofe);
}
